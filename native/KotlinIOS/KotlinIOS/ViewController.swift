import UIKit
import SharedCode

class ViewController: UIViewController, UIPickerViewDataSource, UIPickerViewDelegate {
    @IBOutlet weak var picker: UITextField!
    @IBOutlet weak var pokemonImage: UIImageView!
    let pokemons = PokemonService().obtainPokemons()
    
    override func viewDidLoad() {
        super.viewDidLoad()
    
        let pickerView = UIPickerView()
        pickerView.delegate = self
        picker.inputView = pickerView
    }
    
    func numberOfComponents(in pickerView: UIPickerView) -> Int {
        return 1
    }
    
    func pickerView(_ pickerView: UIPickerView, numberOfRowsInComponent component: Int) -> Int {
        return pokemons.count
    }
    
    func pickerView(_ pickerView: UIPickerView, titleForRow row: Int, forComponent component: Int) -> String? {
        return pokemons[row].name
    }
    
    func pickerView(_ pickerView: UIPickerView, didSelectRow row: Int, inComponent component: Int) {
        picker.text = pokemons[row].name
        pokemonImage.downloaded(from: pokemons[row].image)
    }
}
