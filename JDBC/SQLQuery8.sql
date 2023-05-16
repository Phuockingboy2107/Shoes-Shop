select  students.student_id,students.student_name,courses.course_name,marks.mark
from (students inner join marks on students.student_id = marks.student_id)  inner join courses on marks.course_id = courses.course_id
where students.student_id like'HE163486'