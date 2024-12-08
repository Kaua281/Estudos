const itemList = document.getElementById("itemList");
const itemInput = document.getElementById("itemInput");

function adicionarItem() {
    const itemText = itemInput.value;
    if (itemText) {
        const li = document.createElement("li");
        li.textContent = itemText;
        li.onclick = () => removerItem(li);
        itemList.appendChild(li);
        itemInput.value = "";
    }
}

function removerItem(item) {
    itemList.removeChild(item);
}
