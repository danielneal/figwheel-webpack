# Require issue, minimal repro

Run using figwheel

`clj -M:demo:demo-repl`

Everything works ok

Do a build using 
`clj -M:demo:demo-build`
`python -m SimpleHTTPServer`

Uncaught ReferenceError: require is not defined
