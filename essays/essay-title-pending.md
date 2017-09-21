---
layout: essay
type: essay
published: true
title: Move Over, Grammar Police.
date: 2017-09-21
labels:
  - Computer Science
  - Software Engineering
  - Learning
  - Coding Standards
  - ESLint
  - Javascript
---

In my Software Engineering class, we recently spent a week working with ESLint on IntelliJ. I'm still trying to get used to IntelliJ, since it is yet another IDE for me to learn. Last semester, I worked with Eclipse; the semester before that, jGRASP.

ESLint is an (optional) tool that can be used with IntelliJ that alerts a programmer of syntax errors (and other errors too) within their Javascript code. The errors that are shown are based on a very *specific* style guide. The goal when using ESLint, is to get rid of all "errors" that come up with a red squiggly underline and X, so that you get a green check mark for your code. Yup, ESLint is basically Microsoft Word's spelling and grammar checker for your Javascript code.

Notice the " " around errors. I say this because, what ESLint sees as an error, may not always seem like an error (or a big deal) to us. For example, ESLint will show a syntax error on...
- A line of your code if you use more than two spaces when indenting lines
- Having trailing spaces
- Not including a space before an opening brace
- etc.
It can be a bit annoying sometimes because 
