const form = document.querySelector('form');
      submitBtn = document.querySelector('.submit');
      resetBtn = document.querySelector('.reset');
      allInputs = document.querySelectorAll('input');

submitBtn.addEventListener('click', (e) => {
    allInputs.forEach(input => {
        if(input.value != ""){
            form.classList.add('submitted');
        }
    });
});