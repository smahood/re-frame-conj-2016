# re-frame-conj-2016
Cleaned up code for presenation on re-frame given at Clojure/Conj 2016

Video of the original presentation can be found at https://youtu.be/cDzjlx6otCU

Please feel free to modify as you see fit and use it to give your own presentations or demos.

If you want to rebuild the CSS or edit it, run `lein garden once` for a one time build or 
`lein garden auto` for auto build, garden can be found at https://github.com/noprompt/garden
and lein-garden at https://github.com/noprompt/lein-garden

To run the program, use `lein figwheel` and connect to `http://localhost:3461` - you can change
the port in the `project.clj` file under `:figwheel {:server-port}` if you want, just make sure
you also update it in `:cljsbuild {:builds [{:id "dev" :figwheel {:open-urls ["http://localhost:3461/index.html"]}}]}`
as well if you want it to auto-open correctly.

The final working code is in `re-frame-conj-2016/show/src/show/core.cljs`
Individual snippets can be found in `re-frame-conj-2016/show/src/show/snippets/` and these are what you would use
to manually recreate the talk in a similar way that I did it.
I've also put each complete step in `re-frame-conj-2016/show/src/show/steps/` if you want to run through 
them in order or refer to them separately. 

I tried to fix the issues that I encountered in during my presentation but there may still
be some remaining, particularly in the snippets or individual steps. If you find one, please
let me know or open an issue and I'll try to fix it for you - PR's are welcome too!

If you have any follow-up questions about the talk, please feel free to do one of the following
- Open an issue with your question
- Find me on Clojurians Slack as @shaun-mahood and send me a direct message with your question

