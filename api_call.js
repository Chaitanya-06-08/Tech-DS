async function getData(url) {
  try {
    const response = await fetch(url);
    const read = await response.json();
    let details = read.data;
    console.log(details);
    let content = ``;
    for (let user of details) {
      content += `<div class='card'><h2>${user.first_name}</h2><p>${user.email}</p><img src='${user.avatar}' alt='image' ></div>`;
    }
    document.getElementById("Wrapper").innerHTML += content;
    document.getElementById("Wrapper").style.border = "2px solid white";
    document.getElementById("Wrapper").style.borderRadius = "10px";
  } catch (error) {
    console.log(error);
  }
}

document.querySelector("button").addEventListener("click", () => {
  getData("https://reqres.in/api/users?page=2");
});

// setTimeout(function () {
//   fetch("https://reqres.in/api/users?page=2")
//     .then((res) => {
//       return res.json();
//     })
//     .then((details) => {
//       let content = ``;
//       for (let user of details.data) {
//         content += `<div class='card'><h2>${user.first_name}</h2><p>${user.email}</p><img src='${user.avatar}' alt='image' ></div>`;
//       }
//       document.getElementById("Wrapper").innerHTML += content;
//       document.getElementById("Wrapper").style.border = "2px solid white";
//     })
//     .catch((error) => {
//       console.log(error);
//     });
// }, 3000);
