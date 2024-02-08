sentence = input("Enter a sentence with REPEATED WORDS: ").lower()
replaced = input("Enter the word TO BE REPLACED: ").lower()
replacement = input("Enter the REPLACEMENT WORD: ").lower()
print(sentence.replace(replaced, replacement).upper())
