import React from "react";
import "./App.css";
import Main from "./Components/Main";
import { HashRouter } from "react-router-dom";

function App() {
  return (
    <HashRouter>
      <div>
        {/* App Component Has a Child Component called Main*/}
        <Main />
      </div>
    </HashRouter>
  );
}

export default App;
