package defpackage;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class odp {
    private static Boolean d = null;
    private static String e = null;
    private static boolean f = false;
    private static int g = -1;
    private static Boolean h;
    private static odq l;
    private static odr m;
    public final Context c;
    private static final ThreadLocal i = new ThreadLocal();
    private static final ThreadLocal j = new odh();
    private static final odm k = new odi();
    public static final odo a = new odj(1);
    public static final odo b = new odj(0);

    private odp(Context context) {
        this.c = context;
    }

    public static int a(Context context, String str) throws NoSuchFieldException, ClassNotFoundException {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass(a.cg(str, "com.google.android.gms.dynamite.descriptors.", ".ModuleDescriptor"));
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (a.Q(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", a.cg(str, "Local module descriptor class for ", " not found."));
            return 0;
        } catch (Exception e2) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Type inference failed for: r1v28, types: [android.database.Cursor, java.lang.Object] */
    public static int b(Context context, String str, boolean z) {
        Field declaredField;
        Throwable th;
        RemoteException e2;
        int i2;
        odd odbVar;
        ?? r1;
        try {
            synchronized (odp.class) {
                Boolean bool = d;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e3) {
                        Log.w("DynamiteModule", hhh.c(e3, "Failed to load module via V2: "));
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                f(classLoader);
                            } catch (odl unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!h(context)) {
                                return 0;
                            }
                            if (f || Boolean.TRUE.equals(null)) {
                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                bool = Boolean.FALSE;
                            } else {
                                try {
                                    int iE = e(context, str, z, true);
                                    String str2 = e;
                                    if (str2 != null && !str2.isEmpty()) {
                                        ClassLoader classLoaderA = odf.a();
                                        if (classLoaderA == null) {
                                            if (Build.VERSION.SDK_INT >= 29) {
                                                String str3 = e;
                                                ocv.aF(str3);
                                                classLoaderA = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                            } else {
                                                String str4 = e;
                                                ocv.aF(str4);
                                                classLoaderA = new odg(str4, ClassLoader.getSystemClassLoader());
                                            }
                                        }
                                        f(classLoaderA);
                                        declaredField.set(null, classLoaderA);
                                        d = Boolean.TRUE;
                                        return iE;
                                    }
                                    return iE;
                                } catch (odl unused2) {
                                    declaredField.set(null, ClassLoader.getSystemClassLoader());
                                    bool = Boolean.FALSE;
                                }
                            }
                        }
                        d = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return e(context, str, z, false);
                    } catch (odl e4) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e4.getMessage());
                        return 0;
                    }
                }
                odq odqVarI = i(context);
                try {
                    if (odqVarI == null) {
                        return 0;
                    }
                    try {
                        int iA = odqVarI.a();
                        if (iA >= 3) {
                            xzg xzgVar = (xzg) i.get();
                            if (xzgVar != null && (r1 = xzgVar.a) != 0) {
                                return r1.getInt(0);
                            }
                            odc odcVar = new odc(context);
                            long jLongValue = ((Long) j.get()).longValue();
                            Parcel parcelK = odqVarI.k();
                            ifl.e(parcelK, odcVar);
                            parcelK.writeString(str);
                            parcelK.writeInt(z ? 1 : 0);
                            parcelK.writeLong(jLongValue);
                            Parcel parcelL = odqVarI.l(7, parcelK);
                            IBinder strongBinder = parcelL.readStrongBinder();
                            if (strongBinder == null) {
                                odbVar = null;
                            } else {
                                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                odbVar = iInterfaceQueryLocalInterface instanceof odd ? (odd) iInterfaceQueryLocalInterface : new odb(strongBinder);
                            }
                            parcelL.recycle();
                            Cursor cursor = (Cursor) odc.a(odbVar);
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
                            odc odcVar2 = new odc(context);
                            Parcel parcelK2 = odqVarI.k();
                            ifl.e(parcelK2, odcVar2);
                            parcelK2.writeString(str);
                            parcelK2.writeInt(z ? 1 : 0);
                            Parcel parcelL2 = odqVarI.l(5, parcelK2);
                            i2 = parcelL2.readInt();
                            parcelL2.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            odc odcVar3 = new odc(context);
                            Parcel parcelK3 = odqVarI.k();
                            ifl.e(parcelK3, odcVar3);
                            parcelK3.writeString(str);
                            parcelK3.writeInt(z ? 1 : 0);
                            Parcel parcelL3 = odqVarI.l(3, parcelK3);
                            i2 = parcelL3.readInt();
                            parcelL3.recycle();
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
            ocv.r(context);
            throw th4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b A[Catch: all -> 0x004d, TRY_LEAVE, TryCatch #6 {all -> 0x004d, blocks: (B:9:0x0044, B:17:0x0055, B:20:0x005b, B:32:0x007a), top: B:213:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Type inference failed for: r0v16, types: [android.database.Cursor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [android.database.Cursor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.database.Cursor, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.odp d(android.content.Context r21, defpackage.odo r22, java.lang.String r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 883
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.odp.d(android.content.Context, odo, java.lang.String):odp");
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.odp.e(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static void f(ClassLoader classLoader) throws odl {
        try {
            odr odrVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                odrVar = iInterfaceQueryLocalInterface instanceof odr ? (odr) iInterfaceQueryLocalInterface : new odr(iBinder);
            }
            m = odrVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new odl("Failed to instantiate dynamite loader", e2);
        }
    }

    private static boolean g(Cursor cursor) {
        xzg xzgVar = (xzg) i.get();
        if (xzgVar == null || xzgVar.a != null) {
            return false;
        }
        xzgVar.a = cursor;
        return true;
    }

    private static boolean h(Context context) {
        if (Boolean.TRUE.equals(null) || Boolean.TRUE.equals(h)) {
            return true;
        }
        boolean z = false;
        if (h == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", true != ocv.h() ? 0 : 268435456);
            if (nvk.d.h(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z = true;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            h = boolValueOf;
            boolValueOf.getClass();
            if (z && providerInfoResolveContentProvider.applicationInfo != null && (providerInfoResolveContentProvider.applicationInfo.flags & 129) == 0) {
                f = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    private static odq i(Context context) {
        odq odqVar;
        synchronized (odp.class) {
            odq odqVar2 = l;
            if (odqVar2 != null) {
                return odqVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    odqVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    odqVar = iInterfaceQueryLocalInterface instanceof odq ? (odq) iInterfaceQueryLocalInterface : new odq(iBinder);
                }
                if (odqVar != null) {
                    l = odqVar;
                    return odqVar;
                }
            } catch (Exception e2) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e2.getMessage());
            }
            return null;
        }
    }

    public final IBinder c(String str) throws odl {
        try {
            return (IBinder) this.c.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new odl("Failed to instantiate module class: ".concat(str), e2);
        }
    }
}
