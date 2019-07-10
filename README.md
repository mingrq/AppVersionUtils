# app版本工具

版本1.0.0

### 使用
#
```
在 build.gradle 中添加
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
```
dependencies {
	        implementation 'com.github.mingrq:AppVerisonUtils:Tag'
	}
```
### 方法
#
### static int getVersionCode(Context mContext)
#### 获取app版本号
返回值``版本号``

mContext：上下文
#
### static String getVerName(Context context)
#### 获取app版本名称
返回值``String：版本名称``

context：上下文
#
### static String getAppName(Context context)
#### 获取app名称
返回值``String：APP名称``

context：上下文
