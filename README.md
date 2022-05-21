# Design-patterns
## Creational design patterns
<ol>
<li>Singleton Pattern</li>
<li>Builder Pattern</li>
<li>ProtoType Pattern</li>
<li>Factory Method pattern</li>
<li>Abstract Factory Pattern</li>
</ol>

### 3. Prototype pattern
#### 3.1 Overview
<ul>
    <li> AVoids costly creation </li>
    <li> Avoids subclassing</li>
    <li>Typically doesn't use new</li>
    <li> Often utilizes an Interface</li>
    <li> Usually implemented with a Registry</li>
    <li> Example:
            <ul>
                <li> java.lang.Object#clone()</li>
            </ul>
   </li>
</ul>

#### 3.2 pitfalls
<ul>
<li> Sometimes not clear when to use</li>
<li>Used with other patterns </li>
<li>SHallow copy only</li>
</ul>


### 4. Factory Method pattern
#### 4.1 Overview
<ul>
    <li> Doesn't expose instantiation logic </li>
    <li> Defer to subclass</li>
    <li> Common interface</li>
    <li> Specified by architecture, implemented by user</li>
    <li> Example:
            <ul>
                <li> Calendar</li>
                <li> ResourceBundle</li>
                <li> NumberFormat</li>
            </ul>
   </li>
</ul>
<h5>Design</h5>
<p>
Factory is responsible for lifecycle<br/>
Common Interface<br/>
Concrete Classes<br/>
Parameterized create method
</p>

#### 4.2 pitfalls
<ul>
<li> Complexity, need to write a lot of code</li>
<li>Refactoring is not possible </li>
</ul>

### 5. Abstract Factory pattern
#### 5.1 Overview
<ul>
    <li> Factory of Factories </li>
    <li> Factory of related objects</li>
    <li> Common interface </li>
    <li> Defer to subclass</li>
    <li> Example:
            <ul>
                <li> DocumentBuilder</li>
            </ul>
   </li>
</ul>
<h5>Design</h5>
<p>
Group Factories together<br/>
Factory is responsible for lifecycle<br/>
Common Interface<br/>
Concrete Classes<br/>
Parameterized create method<br/>
Build using composition
</p>

#### 5.2 pitfalls
<ul>
<li> Complexity, need to write a lot of code</li>
<li>Refactoring is not possible </li>
</ul>