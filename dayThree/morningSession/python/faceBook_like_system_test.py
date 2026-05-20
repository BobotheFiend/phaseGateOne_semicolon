from unittest import TestCase

from faceBook_like_system import text_display

class faceBook_like_system(TestCase):

    def test_that_empty_list_return_none(self):
        names = []
        actual = faceBook_like_system.text_display(names)
        expected = "no one likes this"
        self.assertEqual(actual, expected)

    def test_that_full_list_return_none(self):
        names = ["mmo"]
        friends = ["nono", "btid"]
        friends_two = ["hyti", "yhwff", "uwufw"]
        freinds_four_plus = ["hyti", "yhwff", "uwufw"]
    
        
        actual = faceBook_like_system.text_display(names)
        expected = "no one likes this"
        self.assertEqual(actual, expected)
        actual = faceBook_like_system.text_display(names)
        expected = "no one likes this"
        self.assertEqual(actual, expected)
        actual = faceBook_like_system.text_display(names)
        expected = "no one likes this"
        self.assertEqual(actual, expected)
        actual = faceBook_like_system.text_display(names)
        expected = "no one likes this"
        self.assertEqual(actual, expected)
