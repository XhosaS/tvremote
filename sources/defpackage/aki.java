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
public final class aki {
    public static final /* synthetic */ int b = 0;
    private static Boolean c = null;
    private static String d = null;
    private static boolean e = false;
    private static int f = -1;
    private static Boolean g;
    private static final ThreadLocal h = new ThreadLocal();
    private static final ThreadLocal i = new akc();
    private static final akg j = new akd();
    private static akj k;
    private static akk l;
    public final Context a;

    private aki(Context context) {
        this.a = context;
    }

    /* JADX WARN: Type inference failed for: r1v29, types: [android.database.Cursor, java.lang.Object] */
    public static int a(Context context, String str, boolean z) {
        Field declaredField;
        Throwable th;
        RemoteException e2;
        int i2;
        ajy ajwVar;
        ?? r1;
        try {
            synchronized (aki.class) {
                Boolean bool = c;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e3) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e3.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                f(classLoader);
                            } catch (akf unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!h(context)) {
                                return 0;
                            }
                            if (e || Boolean.TRUE.equals(null)) {
                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                bool = Boolean.FALSE;
                            } else {
                                try {
                                    int iD = d(context, str, z, true);
                                    String str2 = d;
                                    if (str2 != null && !str2.isEmpty()) {
                                        ClassLoader classLoaderA = aka.a();
                                        if (classLoaderA == null) {
                                            if (Build.VERSION.SDK_INT >= 29) {
                                                String str3 = d;
                                                qp.p(str3);
                                                classLoaderA = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                            } else {
                                                String str4 = d;
                                                qp.p(str4);
                                                classLoaderA = new akb(str4, ClassLoader.getSystemClassLoader());
                                            }
                                        }
                                        f(classLoaderA);
                                        declaredField.set(null, classLoaderA);
                                        c = Boolean.TRUE;
                                        return iD;
                                    }
                                    return iD;
                                } catch (akf unused2) {
                                    declaredField.set(null, ClassLoader.getSystemClassLoader());
                                    bool = Boolean.FALSE;
                                }
                            }
                        }
                        c = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return d(context, str, z, false);
                    } catch (akf e4) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e4.getMessage());
                        return 0;
                    }
                }
                akj akjVarI = i(context);
                try {
                    if (akjVarI == null) {
                        return 0;
                    }
                    try {
                        int iA = akjVarI.a();
                        if (iA >= 3) {
                            apl aplVar = (apl) h.get();
                            if (aplVar != null && (r1 = aplVar.a) != 0) {
                                return r1.getInt(0);
                            }
                            ajx ajxVar = new ajx(context);
                            long jLongValue = ((Long) i.get()).longValue();
                            Parcel parcelC = akjVarI.c();
                            int i3 = acl.a;
                            parcelC.writeStrongBinder(ajxVar);
                            parcelC.writeString(str);
                            parcelC.writeInt(z ? 1 : 0);
                            parcelC.writeLong(jLongValue);
                            Parcel parcelD = akjVarI.d(7, parcelC);
                            IBinder strongBinder = parcelD.readStrongBinder();
                            if (strongBinder == null) {
                                ajwVar = null;
                            } else {
                                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                ajwVar = iInterfaceQueryLocalInterface instanceof ajy ? (ajy) iInterfaceQueryLocalInterface : new ajw(strongBinder);
                            }
                            parcelD.recycle();
                            Cursor cursor = (Cursor) ajx.b(ajwVar);
                            if (cursor != null) {
                                try {
                                    if (cursor.moveToFirst()) {
                                        i2 = cursor.getInt(0);
                                        cursor = (i2 <= 0 || !g(cursor)) ? cursor : null;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                    }
                                } catch (RemoteException e5) {
                                    e2 = e5;
                                    cursor = cursor;
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e2.getMessage());
                                    if (cursor == null) {
                                        return 0;
                                    }
                                    cursor.close();
                                    return 0;
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor = cursor;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor == null) {
                                return 0;
                            }
                            cursor.close();
                            return 0;
                        }
                        if (iA == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            ajx ajxVar2 = new ajx(context);
                            Parcel parcelC2 = akjVarI.c();
                            int i4 = acl.a;
                            parcelC2.writeStrongBinder(ajxVar2);
                            parcelC2.writeString(str);
                            parcelC2.writeInt(z ? 1 : 0);
                            Parcel parcelD2 = akjVarI.d(5, parcelC2);
                            i2 = parcelD2.readInt();
                            parcelD2.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            ajx ajxVar3 = new ajx(context);
                            Parcel parcelC3 = akjVarI.c();
                            int i5 = acl.a;
                            parcelC3.writeStrongBinder(ajxVar3);
                            parcelC3.writeString(str);
                            parcelC3.writeInt(z ? 1 : 0);
                            Parcel parcelD3 = akjVarI.d(3, parcelC3);
                            i2 = parcelD3.readInt();
                            parcelD3.recycle();
                        }
                        return i2;
                    } catch (RemoteException e6) {
                        e2 = e6;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            qq.f(context);
            throw th4;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [android.database.Cursor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [android.database.Cursor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.database.Cursor, java.lang.Object] */
    public static aki c(Context context, String str) throws Throwable {
        long j2;
        long j3;
        aki akiVarE;
        int i2;
        Boolean bool;
        ajy ajwVar;
        akk akkVar;
        boolean z;
        Boolean boolValueOf;
        ajy ajwVar2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new akf("null application Context");
        }
        ThreadLocal threadLocal = h;
        apl aplVar = (apl) threadLocal.get();
        apl aplVar2 = new apl();
        threadLocal.set(aplVar2);
        ThreadLocal threadLocal2 = i;
        Long l2 = (Long) threadLocal2.get();
        long jLongValue = l2.longValue();
        try {
            j3 = 0;
            try {
                threadLocal2.set(Long.valueOf(SystemClock.uptimeMillis()));
                akh akhVarH = qr.h(context, str, j);
                j2 = jLongValue;
                try {
                    Log.i("DynamiteModule", "Considering local module " + str + ":" + akhVarH.a + " and remote module " + str + ":" + akhVarH.b);
                    int i3 = akhVarH.c;
                    if (i3 == 0 || ((i3 == -1 && akhVarH.a == 0) || (i3 == 1 && akhVarH.b == 0))) {
                        throw new akf("No acceptable module " + str + " found. Local version is " + akhVarH.a + " and remote version is " + akhVarH.b + ".");
                    }
                    if (i3 == -1) {
                        aki akiVarE2 = e(applicationContext, str);
                        if (j2 == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(l2);
                        }
                        ?? r1 = aplVar2.a;
                        if (r1 != 0) {
                            r1.close();
                        }
                        threadLocal.set(aplVar);
                        return akiVarE2;
                    }
                    if (i3 != 1) {
                        throw new akf(b.e(0, "VersionPolicy returned invalid code:"));
                    }
                    try {
                        i2 = akhVarH.b;
                        try {
                            synchronized (aki.class) {
                                if (!h(context)) {
                                    throw new akf("Remote loading disabled");
                                }
                                bool = c;
                            }
                        } catch (akf e2) {
                            throw e2;
                        } catch (RemoteException e3) {
                            throw new akf("Failed to load remote module.", e3);
                        } catch (Throwable th) {
                            qq.f(context);
                            throw new akf("Failed to load remote module.", th);
                        }
                    } catch (akf e4) {
                        Log.w("DynamiteModule", "Failed to load remote module: " + e4.getMessage());
                        int i4 = akhVarH.a;
                        if (i4 == 0 || qr.h(context, str, new ake(i4)).c != -1) {
                            throw new akf("Remote load failed. No local fallback found.", e4);
                        }
                        akiVarE = e(applicationContext, str);
                    }
                    if (bool == null) {
                        throw new akf("Failed to determine which loading route to use.");
                    }
                    if (bool.booleanValue()) {
                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i2);
                        synchronized (aki.class) {
                            akkVar = l;
                        }
                        if (akkVar == null) {
                            throw new akf("DynamiteLoaderV2 was not cached.");
                        }
                        apl aplVar3 = (apl) threadLocal.get();
                        if (aplVar3 == null || aplVar3.a == null) {
                            throw new akf("No result cursor");
                        }
                        Context applicationContext2 = context.getApplicationContext();
                        Object obj = aplVar3.a;
                        new ajx(null);
                        synchronized (aki.class) {
                            z = f >= 2;
                            boolValueOf = Boolean.valueOf(z);
                        }
                        boolValueOf.getClass();
                        if (z) {
                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                            ajx ajxVar = new ajx(applicationContext2);
                            ajx ajxVar2 = new ajx(obj);
                            Parcel parcelC = akkVar.c();
                            int i5 = acl.a;
                            parcelC.writeStrongBinder(ajxVar);
                            parcelC.writeString(str);
                            parcelC.writeInt(i2);
                            parcelC.writeStrongBinder(ajxVar2);
                            Parcel parcelD = akkVar.d(3, parcelC);
                            IBinder strongBinder = parcelD.readStrongBinder();
                            if (strongBinder == null) {
                                ajwVar2 = null;
                            } else {
                                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                ajwVar2 = iInterfaceQueryLocalInterface instanceof ajy ? (ajy) iInterfaceQueryLocalInterface : new ajw(strongBinder);
                            }
                            parcelD.recycle();
                        } else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                            ajx ajxVar3 = new ajx(applicationContext2);
                            ajx ajxVar4 = new ajx(obj);
                            Parcel parcelC2 = akkVar.c();
                            int i6 = acl.a;
                            parcelC2.writeStrongBinder(ajxVar3);
                            parcelC2.writeString(str);
                            parcelC2.writeInt(i2);
                            parcelC2.writeStrongBinder(ajxVar4);
                            Parcel parcelD2 = akkVar.d(2, parcelC2);
                            IBinder strongBinder2 = parcelD2.readStrongBinder();
                            if (strongBinder2 == null) {
                                ajwVar2 = null;
                            } else {
                                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                ajwVar2 = iInterfaceQueryLocalInterface2 instanceof ajy ? (ajy) iInterfaceQueryLocalInterface2 : new ajw(strongBinder2);
                            }
                            parcelD2.recycle();
                        }
                        Context context2 = (Context) ajx.b(ajwVar2);
                        if (context2 == null) {
                            throw new akf("Failed to get module context");
                        }
                        akiVarE = new aki(context2);
                    } else {
                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i2);
                        akj akjVarI = i(context);
                        if (akjVarI == null) {
                            throw new akf("Failed to create IDynamiteLoader.");
                        }
                        int iA = akjVarI.a();
                        if (iA >= 3) {
                            apl aplVar4 = (apl) threadLocal.get();
                            if (aplVar4 == null) {
                                throw new akf("No cached result cursor holder");
                            }
                            ajx ajxVar5 = new ajx(context);
                            ajx ajxVar6 = new ajx(aplVar4.a);
                            Parcel parcelC3 = akjVarI.c();
                            int i7 = acl.a;
                            parcelC3.writeStrongBinder(ajxVar5);
                            parcelC3.writeString(str);
                            parcelC3.writeInt(i2);
                            parcelC3.writeStrongBinder(ajxVar6);
                            Parcel parcelD3 = akjVarI.d(8, parcelC3);
                            IBinder strongBinder3 = parcelD3.readStrongBinder();
                            if (strongBinder3 == null) {
                                ajwVar = null;
                            } else {
                                IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                ajwVar = iInterfaceQueryLocalInterface3 instanceof ajy ? (ajy) iInterfaceQueryLocalInterface3 : new ajw(strongBinder3);
                            }
                            parcelD3.recycle();
                        } else if (iA == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                            ajx ajxVar7 = new ajx(context);
                            Parcel parcelC4 = akjVarI.c();
                            int i8 = acl.a;
                            parcelC4.writeStrongBinder(ajxVar7);
                            parcelC4.writeString(str);
                            parcelC4.writeInt(i2);
                            Parcel parcelD4 = akjVarI.d(4, parcelC4);
                            IBinder strongBinder4 = parcelD4.readStrongBinder();
                            if (strongBinder4 == null) {
                                ajwVar = null;
                            } else {
                                IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                ajwVar = iInterfaceQueryLocalInterface4 instanceof ajy ? (ajy) iInterfaceQueryLocalInterface4 : new ajw(strongBinder4);
                            }
                            parcelD4.recycle();
                        } else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                            ajx ajxVar8 = new ajx(context);
                            Parcel parcelC5 = akjVarI.c();
                            int i9 = acl.a;
                            parcelC5.writeStrongBinder(ajxVar8);
                            parcelC5.writeString(str);
                            parcelC5.writeInt(i2);
                            Parcel parcelD5 = akjVarI.d(2, parcelC5);
                            IBinder strongBinder5 = parcelD5.readStrongBinder();
                            if (strongBinder5 == null) {
                                ajwVar = null;
                            } else {
                                IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                ajwVar = iInterfaceQueryLocalInterface5 instanceof ajy ? (ajy) iInterfaceQueryLocalInterface5 : new ajw(strongBinder5);
                            }
                            parcelD5.recycle();
                        }
                        Object objB = ajx.b(ajwVar);
                        if (objB == null) {
                            throw new akf("Failed to load remote module.");
                        }
                        akiVarE = new aki((Context) objB);
                    }
                    if (j2 == 0) {
                        i.remove();
                    } else {
                        i.set(l2);
                    }
                    ?? r0 = aplVar2.a;
                    if (r0 != 0) {
                        r0.close();
                    }
                    h.set(aplVar);
                    return akiVarE;
                } catch (Throwable th2) {
                    th = th2;
                    if (j2 == j3) {
                        i.remove();
                    } else {
                        i.set(l2);
                    }
                    ?? r12 = aplVar2.a;
                    if (r12 != 0) {
                        r12.close();
                    }
                    h.set(aplVar);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                j2 = jLongValue;
            }
        } catch (Throwable th4) {
            th = th4;
            j2 = jLongValue;
            j3 = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0124 A[PHI: r13
  0x0124: PHI (r13v6 boolean) = (r13v5 boolean), (r13v9 boolean) binds: [B:59:0x00ec, B:74:0x011d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int d(android.content.Context r12, java.lang.String r13, boolean r14, boolean r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aki.d(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static aki e(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(str));
        return new aki(context);
    }

    private static void f(ClassLoader classLoader) throws akf {
        try {
            akk akkVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                akkVar = iInterfaceQueryLocalInterface instanceof akk ? (akk) iInterfaceQueryLocalInterface : new akk(iBinder);
            }
            l = akkVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new akf("Failed to instantiate dynamite loader", e2);
        }
    }

    private static boolean g(Cursor cursor) {
        apl aplVar = (apl) h.get();
        if (aplVar == null || aplVar.a != null) {
            return false;
        }
        aplVar.a = cursor;
        return true;
    }

    private static boolean h(Context context) {
        if (Boolean.TRUE.equals(null) || Boolean.TRUE.equals(g)) {
            return true;
        }
        boolean z = false;
        if (g == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT < 29 ? 0 : 268435456);
            if (aev.c.c(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z = true;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            g = boolValueOf;
            boolValueOf.getClass();
            if (z && providerInfoResolveContentProvider.applicationInfo != null && (providerInfoResolveContentProvider.applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                e = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    private static akj i(Context context) {
        akj akjVar;
        synchronized (aki.class) {
            akj akjVar2 = k;
            if (akjVar2 != null) {
                return akjVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    akjVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    akjVar = iInterfaceQueryLocalInterface instanceof akj ? (akj) iInterfaceQueryLocalInterface : new akj(iBinder);
                }
                if (akjVar != null) {
                    k = akjVar;
                    return akjVar;
                }
            } catch (Exception e2) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e2.getMessage());
            }
            return null;
        }
    }

    public final IBinder b() throws akf {
        try {
            return (IBinder) this.a.getClassLoader().loadClass("com.google.android.gms.common.GoogleCertificatesImpl").newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new akf("Failed to instantiate module class: com.google.android.gms.common.GoogleCertificatesImpl", e2);
        }
    }
}
