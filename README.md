# coolweather 酷欧天气
*《第一行代码》* Demo  
  
**项目演示**：
<img src="gif/coolweather.gif" alt="Sample"  width="300" height="480">  
  
**项目介绍**：    
可以查询全国各地的天气数据（精确到区）。  
  
**所使用的到的控件/技术**：   

| 控件/技术 | 用途 |
|:---:|:---:|
|Service|每8个小时更新一次天气数据和背景图片|
|ListView|显示城市/地区列表，使用的系统自带的adapter|
|SharedPreferences|用于存取当前选择的地区的天气数据|
|ProgressDialog|进度提示框|
|DrawerLayout|实现侧滑fragment选择城市/地区|
|SwipeRefreshLayout|实现下拉刷新功能|

**所使用的到的框架**：   

| 框架| 用途|
|:---:|:---:|
|[Litepal](https://github.com/LitePalFramework/LitePal)|存取全国各城市/地区数据，避免每次都从网络上获取|
|[okhttp](https://github.com/square/okhttp)|发起网络请求|
|[gson](https://github.com/google/gson)|解析网络请求获取的json数据|
|[glide](https://github.com/bumptech/glide)|加载背景图片|