print("-------------------")
print("| Word Compressor |")
print("-------------------")
print()

word_str = "aabccccaaa"
compressed_word = ""
count = 1
for i in range(len(word_str)):
    if i + 1 < len(word_str) and word_str[i] == word_str[i + 1]:
        count += 1
    else:
        compressed_word += word_str[i]
        compressed_word += str(count)
        count = 1

print("Original word:", word_str)
print("Compressed word:", compressed_word)
