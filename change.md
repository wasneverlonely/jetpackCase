

jetpack组件

四部分  基础  架构  行为  界面


ViewModel 是以生命周期的方式储存与管理Ui相关数据

作用 : 在MVVM模式中 使Model与View分离
        储存数据
        负责为Ui准备数据

注意：
      1.ViewModel的生命周期比Activity或者Fragment长，因此 ViewModel不能持有Context的对象，不然会出现内存泄漏。
      2. Activity在生命周期中可能会触发多次onCreate()，而ViewModel则只会在第一次onCreate()时创建，然后直到最后Activity销毁。

ViewModelProviders 外观类 负责封装ViewModelProvider初始化
ViewModelStores  判断通过FragmentActivity还是创建HolderFragment，获取ViewModelStore对象。
FragmentActivity/HolderFragment  负责创建与管理ViewModelStore
ViewModelStore  通过HashMap存储Activity的ViewModel实例
AndroidViewModelFactory   负责使用反射的方式创建ViewModel。

同步：接收端数据回调与发送端同一个线程。
 setValue(user);
 
异步：接收端在主线程回调数据。
  postValue(user);
  
  

LiveData

1 持久化的观察数据的更改与变化  & 及时通知ui更新

特点
1.感知对应Activity的生命周期，只有生命周期处于onStart与onResume时，LiveData处于活动状态，才会把更新的数据通知至对应的Activity。
2.当生命周期处于onStop或者onPause时，不回调数据更新，直至到生命周期为onResume时，立即回调。
3.当生命周期处于onDestory时，观察者会自动删除，防止内存溢出。
4.共享资源。您可以使用单例模式扩展LiveData对象以包装系统服务，以便可以在应用程序中共享它们。 LiveData对象连接到系统服务一次，然后任何需要该资源的观察者都可以只观看LiveData对象。

Observer 观察者 负责监听数据变化 & 回调
LifecycleOwner 感知Activity生命周期的类
LifecycleBoundObserver 负责关联Observer与LifeccycleOwner
SafelterableMap 以<Observer,LifecycleBoundObserver>的格式存储多个观察者。

LiveData是一个抽象类，使用时应用MutableLiveData


Room

Room 是Google为了简化旧式的SQLite操作专门提供的一个覆盖SQLite抽象层框架库
介绍 ：
 实现 SQLite 的增删改查
特点：
 1 使用简单（类似于Retrofit库），通过注解的方式实现相关功能。
 22拥有SQLite的所有操作功能（表所有操作、版本升级....）。

Bean ： 实体类，表示数据库表的数据。
Dao ： 数据操作类，包含用于访问数据库的方法。
Database ： 数据库持有者 & 数据库版本管理者。
Room : 数据库的创建者 & 负责数据库版本更新的具体实现者。

@Entity ： 数据表的实体类。
@PrimaryKey ： 每一个实体类都需要一个唯一的标识。
@ColumnInfo ： 数据表中字段名称。
@Ignore ： 标注不需要添加到数据表中的属性。
@Embedded ： 实体类中引用其他实体类。
@ForeignKey ： 外键约束。


@Dao ： 标注数据库操作的类。
@Query ： 包含所有Sqlite语句操作。
@Insert ： 标注数据库的插入操作。
@Delete ： 标注数据库的删除操作。
@Update ： 标注数据库的更新操作。

@Database ： 标注数据库持久化的类。

ABORT ： 默认值，不处理约束异常。
ROLLBACK ： 与ABORT相似，不常用。
FAIL ： 在批量更新或者修改时，中途出现了约束异常，就会终止后续执行，但会保留已执行的sql语句。
IGNORE ： 忽略约束异常，不做任何处理保留原数据。
REPLACE ： 当出现约束异常时，移除原数据 & 将新数据覆盖。


Lifecycles
Lifecycles 包含有关Activity与Fragment生命周期状态的信息，并允许其他对象观察此状态
1.观察组件(Activtiy、Fragment)的生命周期状态。

DataBinding
DataBinding 是以声明的方式，将布局中组件与应用程序源数据绑定在一起的框架库。

作用
1.将布局组件与源数据绑定，使源数据变化的同时布局组件及时同步更新。
2.减少Activity中View的定义(private View view)与初始化(findViewById)，让Activity代码更专注于界面的逻辑更新。
3.可自定义适配器，实现扩展组件的属性功能。
4.可自定义事件，实现各种组件的事件触发功能。

特点：
1.使用简单，主要以声明的方式实现。
2.功能强大，可自定义适配器 & 事件 ，兼容各种界面逻辑需求。

