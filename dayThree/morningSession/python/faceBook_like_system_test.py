from unittest import TestCase

from faceBook_like_system import text_display

class faceBook_like_system(TestCase):

    def test_that_empty_list_return_none(self):
        names = []
        actual = faceBook_like_system.text_display(names)
        expected = "no one likes this"
        self.assertEqual(actual, expected)
