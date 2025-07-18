package defpackage;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kmv {
    private static Boolean f = null;
    private static String g = null;
    private static boolean h = false;
    private static int i = -1;
    private static Boolean j;
    private static kmw n;
    private static kmx o;
    public final Context e;
    private static final ThreadLocal k = new ThreadLocal();
    private static final ThreadLocal l = new kmj();
    private static final kms m = new kmk();
    public static final kmu a = new kml();
    public static final kmu b = new kmm();
    public static final kmu c = new kmn();
    public static final kmu d = new kmo();

    private kmv(Context context) {
        this.e = context;
    }

    public static int a(Context context, String str) throws NoSuchFieldException, ClassNotFoundException {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass(a.e(str, "com.google.android.gms.dynamite.descriptors.", ".ModuleDescriptor"));
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (kki.a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", a.e(str, "Local module descriptor class for ", " not found."));
            return 0;
        } catch (Exception e) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage())));
            return 0;
        }
    }

    public static int b(Context context, String str, boolean z) {
        Field declaredField;
        Throwable th;
        RemoteException e;
        int i2;
        kme kmcVar;
        Cursor cursor;
        try {
            synchronized (kmv.class) {
                Boolean bool = f;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                        Log.w("DynamiteModule", a.q(e2, "Failed to load module via V2: "));
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                g(classLoader);
                            } catch (kmr unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!i(context)) {
                                return 0;
                            }
                            if (h || Boolean.TRUE.equals(null)) {
                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                bool = Boolean.FALSE;
                            } else {
                                try {
                                    int iE = e(context, str, z, true);
                                    String str2 = g;
                                    if (str2 != null && !str2.isEmpty()) {
                                        ClassLoader classLoaderA = kmh.a();
                                        if (classLoaderA == null) {
                                            if (Build.VERSION.SDK_INT >= 29) {
                                                String str3 = g;
                                                kkk.k(str3);
                                                classLoaderA = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                            } else {
                                                String str4 = g;
                                                kkk.k(str4);
                                                classLoaderA = new kmi(str4, ClassLoader.getSystemClassLoader());
                                            }
                                        }
                                        g(classLoaderA);
                                        declaredField.set(null, classLoaderA);
                                        f = Boolean.TRUE;
                                        return iE;
                                    }
                                    return iE;
                                } catch (kmr unused2) {
                                    declaredField.set(null, ClassLoader.getSystemClassLoader());
                                    bool = Boolean.FALSE;
                                }
                            }
                        }
                        f = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return e(context, str, z, false);
                    } catch (kmr e3) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e3.getMessage());
                        return 0;
                    }
                }
                kmw kmwVarJ = j(context);
                try {
                    if (kmwVarJ == null) {
                        return 0;
                    }
                    try {
                        int iE2 = kmwVarJ.e();
                        if (iE2 >= 3) {
                            kmp kmpVar = (kmp) k.get();
                            if (kmpVar != null && (cursor = kmpVar.a) != null) {
                                return cursor.getInt(0);
                            }
                            kmf kmfVar = new kmf(context);
                            long jLongValue = ((Long) l.get()).longValue();
                            Parcel parcelA = kmwVarJ.a();
                            erv.c(parcelA, kmfVar);
                            parcelA.writeString(str);
                            parcelA.writeInt(z ? 1 : 0);
                            parcelA.writeLong(jLongValue);
                            Parcel parcelB = kmwVarJ.b(7, parcelA);
                            IBinder strongBinder = parcelB.readStrongBinder();
                            if (strongBinder == null) {
                                kmcVar = null;
                            } else {
                                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                kmcVar = iInterfaceQueryLocalInterface instanceof kme ? (kme) iInterfaceQueryLocalInterface : new kmc(strongBinder);
                            }
                            parcelB.recycle();
                            Cursor cursor2 = (Cursor) kmf.c(kmcVar);
                            if (cursor2 != null) {
                                try {
                                    if (cursor2.moveToFirst()) {
                                        i2 = cursor2.getInt(0);
                                        cursor = (i2 <= 0 || !h(cursor2)) ? cursor2 : null;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                    }
                                } catch (RemoteException e4) {
                                    e = e4;
                                    cursor = cursor2;
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e.getMessage());
                                    if (cursor == null) {
                                        return 0;
                                    }
                                    cursor.close();
                                    return 0;
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor = cursor2;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor2 == null) {
                                return 0;
                            }
                            cursor2.close();
                            return 0;
                        }
                        if (iE2 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            kmf kmfVar2 = new kmf(context);
                            Parcel parcelA2 = kmwVarJ.a();
                            erv.c(parcelA2, kmfVar2);
                            parcelA2.writeString(str);
                            parcelA2.writeInt(z ? 1 : 0);
                            Parcel parcelB2 = kmwVarJ.b(5, parcelA2);
                            i2 = parcelB2.readInt();
                            parcelB2.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            kmf kmfVar3 = new kmf(context);
                            Parcel parcelA3 = kmwVarJ.a();
                            erv.c(parcelA3, kmfVar3);
                            parcelA3.writeString(str);
                            parcelA3.writeInt(z ? 1 : 0);
                            Parcel parcelB3 = kmwVarJ.b(3, parcelA3);
                            i2 = parcelB3.readInt();
                            parcelB3.recycle();
                        }
                        return i2;
                    } catch (RemoteException e5) {
                        e = e5;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            klj.a(context);
            throw th4;
        }
    }

    public static kmv d(Context context, kmu kmuVar, String str) throws Throwable {
        long j2;
        long j3;
        kmt kmtVarA;
        kmv kmvVarF;
        int i2;
        Boolean bool;
        kme kmcVar;
        kmx kmxVar;
        boolean z;
        Boolean boolValueOf;
        kme kmcVar2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new kmr("null application Context");
        }
        ThreadLocal threadLocal = k;
        kmp kmpVar = (kmp) threadLocal.get();
        kmp kmpVar2 = new kmp();
        threadLocal.set(kmpVar2);
        ThreadLocal threadLocal2 = l;
        Long l2 = (Long) threadLocal2.get();
        long jLongValue = l2.longValue();
        try {
            j3 = 0;
            try {
                threadLocal2.set(Long.valueOf(SystemClock.uptimeMillis()));
                kmtVarA = kmuVar.a(context, str, m);
                j2 = jLongValue;
            } catch (Throwable th) {
                th = th;
                j2 = jLongValue;
            }
        } catch (Throwable th2) {
            th = th2;
            j2 = jLongValue;
            j3 = 0;
        }
        try {
            Log.i("DynamiteModule", "Considering local module " + str + ":" + kmtVarA.a + " and remote module " + str + ":" + kmtVarA.b);
            int i3 = kmtVarA.c;
            if (i3 == 0 || ((i3 == -1 && kmtVarA.a == 0) || (i3 == 1 && kmtVarA.b == 0))) {
                throw new kmr("No acceptable module " + str + " found. Local version is " + kmtVarA.a + " and remote version is " + kmtVarA.b + ".");
            }
            if (i3 == -1) {
                kmv kmvVarF2 = f(applicationContext, str);
                if (j2 == 0) {
                    threadLocal2.remove();
                } else {
                    threadLocal2.set(l2);
                }
                Cursor cursor = kmpVar2.a;
                if (cursor != null) {
                    cursor.close();
                }
                threadLocal.set(kmpVar);
                return kmvVarF2;
            }
            if (i3 != 1) {
                throw new kmr(a.b(0, "VersionPolicy returned invalid code:"));
            }
            try {
                i2 = kmtVarA.b;
                try {
                    synchronized (kmv.class) {
                        if (!i(context)) {
                            throw new kmr("Remote loading disabled");
                        }
                        bool = f;
                    }
                } catch (RemoteException e) {
                    throw new kmr("Failed to load remote module.", e);
                } catch (kmr e2) {
                    throw e2;
                } catch (Throwable th3) {
                    klj.a(context);
                    throw new kmr("Failed to load remote module.", th3);
                }
            } catch (kmr e3) {
                Log.w("DynamiteModule", "Failed to load remote module: " + e3.getMessage());
                int i4 = kmtVarA.a;
                if (i4 == 0 || kmuVar.a(context, str, new kmq(i4)).c != -1) {
                    throw new kmr("Remote load failed. No local fallback found.", e3);
                }
                kmvVarF = f(applicationContext, str);
            }
            if (bool == null) {
                throw new kmr("Failed to determine which loading route to use.");
            }
            if (bool.booleanValue()) {
                Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i2);
                synchronized (kmv.class) {
                    kmxVar = o;
                }
                if (kmxVar == null) {
                    throw new kmr("DynamiteLoaderV2 was not cached.");
                }
                kmp kmpVar3 = (kmp) threadLocal.get();
                if (kmpVar3 == null || kmpVar3.a == null) {
                    throw new kmr("No result cursor");
                }
                Context applicationContext2 = context.getApplicationContext();
                Cursor cursor2 = kmpVar3.a;
                new kmf(null);
                synchronized (kmv.class) {
                    z = i >= 2;
                    boolValueOf = Boolean.valueOf(z);
                }
                boolValueOf.getClass();
                if (z) {
                    Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                    kmf kmfVar = new kmf(applicationContext2);
                    kmf kmfVar2 = new kmf(cursor2);
                    Parcel parcelA = kmxVar.a();
                    erv.c(parcelA, kmfVar);
                    parcelA.writeString(str);
                    parcelA.writeInt(i2);
                    erv.c(parcelA, kmfVar2);
                    Parcel parcelB = kmxVar.b(3, parcelA);
                    IBinder strongBinder = parcelB.readStrongBinder();
                    if (strongBinder == null) {
                        kmcVar2 = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                        kmcVar2 = iInterfaceQueryLocalInterface instanceof kme ? (kme) iInterfaceQueryLocalInterface : new kmc(strongBinder);
                    }
                    parcelB.recycle();
                } else {
                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                    kmf kmfVar3 = new kmf(applicationContext2);
                    kmf kmfVar4 = new kmf(cursor2);
                    Parcel parcelA2 = kmxVar.a();
                    erv.c(parcelA2, kmfVar3);
                    parcelA2.writeString(str);
                    parcelA2.writeInt(i2);
                    erv.c(parcelA2, kmfVar4);
                    Parcel parcelB2 = kmxVar.b(2, parcelA2);
                    IBinder strongBinder2 = parcelB2.readStrongBinder();
                    if (strongBinder2 == null) {
                        kmcVar2 = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                        kmcVar2 = iInterfaceQueryLocalInterface2 instanceof kme ? (kme) iInterfaceQueryLocalInterface2 : new kmc(strongBinder2);
                    }
                    parcelB2.recycle();
                }
                Context context2 = (Context) kmf.c(kmcVar2);
                if (context2 == null) {
                    throw new kmr("Failed to get module context");
                }
                kmvVarF = new kmv(context2);
            } else {
                Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i2);
                kmw kmwVarJ = j(context);
                if (kmwVarJ == null) {
                    throw new kmr("Failed to create IDynamiteLoader.");
                }
                int iE = kmwVarJ.e();
                if (iE >= 3) {
                    kmp kmpVar4 = (kmp) threadLocal.get();
                    if (kmpVar4 == null) {
                        throw new kmr("No cached result cursor holder");
                    }
                    kmf kmfVar5 = new kmf(context);
                    kmf kmfVar6 = new kmf(kmpVar4.a);
                    Parcel parcelA3 = kmwVarJ.a();
                    erv.c(parcelA3, kmfVar5);
                    parcelA3.writeString(str);
                    parcelA3.writeInt(i2);
                    erv.c(parcelA3, kmfVar6);
                    Parcel parcelB3 = kmwVarJ.b(8, parcelA3);
                    IBinder strongBinder3 = parcelB3.readStrongBinder();
                    if (strongBinder3 == null) {
                        kmcVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                        kmcVar = iInterfaceQueryLocalInterface3 instanceof kme ? (kme) iInterfaceQueryLocalInterface3 : new kmc(strongBinder3);
                    }
                    parcelB3.recycle();
                } else if (iE == 2) {
                    Log.w("DynamiteModule", "IDynamite loader version = 2");
                    kmf kmfVar7 = new kmf(context);
                    Parcel parcelA4 = kmwVarJ.a();
                    erv.c(parcelA4, kmfVar7);
                    parcelA4.writeString(str);
                    parcelA4.writeInt(i2);
                    Parcel parcelB4 = kmwVarJ.b(4, parcelA4);
                    IBinder strongBinder4 = parcelB4.readStrongBinder();
                    if (strongBinder4 == null) {
                        kmcVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                        kmcVar = iInterfaceQueryLocalInterface4 instanceof kme ? (kme) iInterfaceQueryLocalInterface4 : new kmc(strongBinder4);
                    }
                    parcelB4.recycle();
                } else {
                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                    kmf kmfVar8 = new kmf(context);
                    Parcel parcelA5 = kmwVarJ.a();
                    erv.c(parcelA5, kmfVar8);
                    parcelA5.writeString(str);
                    parcelA5.writeInt(i2);
                    Parcel parcelB5 = kmwVarJ.b(2, parcelA5);
                    IBinder strongBinder5 = parcelB5.readStrongBinder();
                    if (strongBinder5 == null) {
                        kmcVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                        kmcVar = iInterfaceQueryLocalInterface5 instanceof kme ? (kme) iInterfaceQueryLocalInterface5 : new kmc(strongBinder5);
                    }
                    parcelB5.recycle();
                }
                Object objC = kmf.c(kmcVar);
                if (objC == null) {
                    throw new kmr("Failed to load remote module.");
                }
                kmvVarF = new kmv((Context) objC);
            }
            if (j2 == 0) {
                l.remove();
            } else {
                l.set(l2);
            }
            Cursor cursor3 = kmpVar2.a;
            if (cursor3 != null) {
                cursor3.close();
            }
            k.set(kmpVar);
            return kmvVarF;
        } catch (Throwable th4) {
            th = th4;
            if (j2 == j3) {
                l.remove();
            } else {
                l.set(l2);
            }
            Cursor cursor4 = kmpVar2.a;
            if (cursor4 != null) {
                cursor4.close();
            }
            k.set(kmpVar);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0124 A[PHI: r13
  0x0124: PHI (r13v6 boolean) = (r13v5 boolean), (r13v9 boolean) binds: [B:59:0x00ec, B:74:0x011d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int e(android.content.Context r12, java.lang.String r13, boolean r14, boolean r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kmv.e(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static kmv f(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(str));
        return new kmv(context);
    }

    private static void g(ClassLoader classLoader) throws kmr {
        try {
            kmx kmxVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                kmxVar = iInterfaceQueryLocalInterface instanceof kmx ? (kmx) iInterfaceQueryLocalInterface : new kmx(iBinder);
            }
            o = kmxVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new kmr("Failed to instantiate dynamite loader", e);
        }
    }

    private static boolean h(Cursor cursor) {
        kmp kmpVar = (kmp) k.get();
        if (kmpVar == null || kmpVar.a != null) {
            return false;
        }
        kmpVar.a = cursor;
        return true;
    }

    private static boolean i(Context context) {
        if (Boolean.TRUE.equals(null) || Boolean.TRUE.equals(j)) {
            return true;
        }
        boolean z = false;
        if (j == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", true != klp.a() ? 0 : 268435456);
            if (kcy.d.g(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z = true;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            j = boolValueOf;
            boolValueOf.getClass();
            if (z && providerInfoResolveContentProvider.applicationInfo != null && (providerInfoResolveContentProvider.applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                h = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    private static kmw j(Context context) {
        kmw kmwVar;
        synchronized (kmv.class) {
            kmw kmwVar2 = n;
            if (kmwVar2 != null) {
                return kmwVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    kmwVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    kmwVar = iInterfaceQueryLocalInterface instanceof kmw ? (kmw) iInterfaceQueryLocalInterface : new kmw(iBinder);
                }
                if (kmwVar != null) {
                    n = kmwVar;
                    return kmwVar;
                }
            } catch (Exception e) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e.getMessage());
            }
            return null;
        }
    }

    public final IBinder c(String str) throws kmr {
        try {
            return (IBinder) this.e.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new kmr("Failed to instantiate module class: ".concat(str), e);
        }
    }
}
