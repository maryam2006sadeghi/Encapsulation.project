  این پروژه یک سیستم ساده مدیریت حساب‌های بانکی است که با استفاده از مفاهیم شیءگرایی و کپسوله‌سازی طراحی شده :
  ویژگی های پروژه :
  دارای دو نوع حساب:  
   حساب پس‌انداز و حساب جاری با امکان برداشت بیش از موجودی   

کلاس ها :  
BankAccount  
    شامل اطلاعات مشترک همه حساب‌ها (شماره حساب، نام مشتری، موجودی)  
    متدهای اصلی:deposit(), withdraw(), calculateInterest()  
SavingAccount  
     سود ثابت interestRate = 0.03  
    محاسبه سود و افزودن به موجودی با متد calculateInterest()  
TransactionAccount  
    امکان برداشت تا سقف مجاز 
    نداشتن سود  

BankCustomers  
    مدیریت لیست حساب‌ها  
    قابلیت‌های:  
      افزودن حساب addAccount() 
      نمایش اطلاعات همه حساب‌ها showAllBalances()  
      جستجوی حساب findAccount() 

    خط های توی main هم مطابق داکیومنت بود که مرحله مرحله با توجه به خواسته های گفته شده مانند ایجاد حساب بانکی از هر دو نوع و اضافه کردن ان های که به بانک 
    استفاده از متد findAcount، اضافه کردن پول با مقادیر مجاز و غیر مجاز ، برررسی وجود حساب ها ، چاپ اطلاعات همه حساب ها و ...
