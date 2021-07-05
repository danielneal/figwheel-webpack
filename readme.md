# Require issue, minimal repro

Run using figwheel

`clj -M:demo:demo-repl`

Everything works ok

Do a build using 
`clj -M:demo:demo-build`, then serve using the index.html in the root pointing to the built js file, with `python -m SimpleHTTPServer`.

Uncaught ReferenceError: require is not defined
