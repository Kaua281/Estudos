// Elementos
const studentForm = document.getElementById('studentForm');
const studentTable = document.getElementById('studentTable');
const studentId = document.getElementById('studentId');
const nameInput = document.getElementById('name');
const ageInput = document.getElementById('age');
const saveButton = document.getElementById('saveButton');

// Carrega alunos do LocalStorage
let students = JSON.parse(localStorage.getItem('students')) || [];

// Renderiza a tabela de alunos
function renderTable() {
    studentTable.innerHTML = '';
    students.forEach((student, index) => {
        studentTable.innerHTML += `
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.age}</td>
                <td class="actions">
                    <button onclick="editStudent(${index})">Editar</button>
                    <button onclick="deleteStudent(${index})">Excluir</button>
                </td>
            </tr>
        `;
    });
}

// Adiciona ou atualiza um aluno
studentForm.addEventListener('submit', (event) => {
    event.preventDefault();
    const id = studentId.value ? parseInt(studentId.value) : Date.now();
    const name = nameInput.value.trim();
    const age = parseInt(ageInput.value);

    if (studentId.value) {
        // Atualiza aluno existente
        const index = students.findIndex(student => student.id === id);
        students[index] = { id, name, age };
    } else {
        // Adiciona novo aluno
        students.push({ id, name, age });
    }

    localStorage.setItem('students', JSON.stringify(students));
    renderTable();
    studentForm.reset();
    studentId.value = '';
});

// Edita aluno
function editStudent(index) {
    const student = students[index];
    studentId.value = student.id;
    nameInput.value = student.name;
    ageInput.value = student.age;
}

// Exclui aluno
function deleteStudent(index) {
    students.splice(index, 1);
    localStorage.setItem('students', JSON.stringify(students));
    renderTable();
}

// Inicializa a tabela
renderTable();
