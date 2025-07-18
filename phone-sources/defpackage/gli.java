package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import android.util.Property;
import android.view.Display;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.versionedparcelable.ParcelImpl;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import com.google.android.videos.R;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public class gli {
    private static Method a;
    public static long q;
    public static Method r;
    public static Method s;

    public gli() {
    }

    public static void A(gox goxVar, Map map) {
        goxVar.getClass();
        B(goxVar.b, map);
    }

    public static void B(Map map, Map map2) {
        for (Map.Entry entry : map.entrySet()) {
            z((String) entry.getKey(), entry.getValue(), map2);
        }
    }

    public static void C(String str, byte[] bArr, Map map) {
        map.put(str, goy.a(bArr));
    }

    public static void D(String str, Object obj, Map map) {
        map.put(str, obj);
    }

    public static Executor E(boolean z) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new gor(z));
        executorServiceNewFixedThreadPool.getClass();
        return executorServiceNewFixedThreadPool;
    }

    public static boolean F(String str, yjk yjkVar) {
        try {
            boolean zBooleanValue = ((Boolean) yjkVar.a()).booleanValue();
            if (!zBooleanValue) {
                Log.e("ReflectionGuard", str);
            }
            return zBooleanValue;
        } catch (ClassNotFoundException unused) {
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchFieldException unused2) {
            Log.e("ReflectionGuard", "NoSuchField: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused3) {
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    public static boolean G(yjk yjkVar) {
        try {
            yjkVar.a();
            return true;
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            return false;
        }
    }

    public static boolean H(Method method, Class cls) {
        cls.getClass();
        return method.getReturnType().equals(cls);
    }

    public static boolean I(Method method) {
        return Modifier.isPublic(method.getModifiers());
    }

    public static boolean J(Method method, ymh ymhVar) {
        return H(method, wef.o(ymhVar));
    }

    public static goo K() {
        return Build.VERSION.SDK_INT >= 34 ? gop.a : Build.VERSION.SDK_INT >= 30 ? gop.b : gop.c;
    }

    public static Point L(Display display) {
        Point point = new Point();
        display.getRealSize(point);
        return point;
    }

    public static int M(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static IBinder N(Activity activity) {
        Window window;
        WindowManager.LayoutParams attributes;
        if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
            return null;
        }
        return attributes.token;
    }

    public static gnf O() throws NumberFormatException {
        String apiVersion;
        String strGroup;
        try {
            apiVersion = SidecarProvider.getApiVersion();
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
        }
        if (TextUtils.isEmpty(apiVersion) || apiVersion == null || ylh.L(apiVersion)) {
            return null;
        }
        Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(apiVersion);
        if (matcher.matches() && (strGroup = matcher.group(1)) != null) {
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            if (strGroup2 != null) {
                int i2 = Integer.parseInt(strGroup2);
                String strGroup3 = matcher.group(3);
                if (strGroup3 != null) {
                    int i3 = Integer.parseInt(strGroup3);
                    String strGroup4 = matcher.group(4) != null ? matcher.group(4) : "";
                    strGroup4.getClass();
                    return new gnf(i, i2, i3, strGroup4);
                }
            }
        }
        return null;
    }

    public static int P(SidecarDeviceState sidecarDeviceState) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int iIntValue;
        try {
            try {
                iIntValue = sidecarDeviceState.posture;
            } catch (NoSuchFieldError unused) {
                Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                objInvoke.getClass();
                iIntValue = ((Integer) objInvoke).intValue();
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            iIntValue = 0;
        }
        if (iIntValue < 0 || iIntValue > 4) {
            return 0;
        }
        return iIntValue;
    }

    public static List Q(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
                return list == null ? yhb.a : list;
            } catch (NoSuchFieldError unused) {
                Object objInvoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                objInvoke.getClass();
                return (List) objInvoke;
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            return yhb.a;
        }
    }

    public static gns R(gnt gntVar, WindowLayoutInfo windowLayoutInfo) {
        gnn gnnVar;
        gnl gnlVar;
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        displayFeatures.getClass();
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            gno gnoVar = null;
            if (foldingFeature instanceof FoldingFeature) {
                FoldingFeature foldingFeature2 = foldingFeature;
                foldingFeature2.getClass();
                int type = foldingFeature2.getType();
                if (type == 1) {
                    gnnVar = gnn.a;
                } else if (type == 2) {
                    gnnVar = gnn.b;
                }
                int state = foldingFeature2.getState();
                if (state == 1) {
                    gnlVar = gnl.a;
                } else if (state == 2) {
                    gnlVar = gnl.b;
                }
                Rect bounds = foldingFeature2.getBounds();
                bounds.getClass();
                gmx gmxVar = new gmx(bounds);
                Rect rectC = gntVar.a.c();
                if ((gmxVar.a() != 0 || gmxVar.b() != 0) && ((gmxVar.b() == rectC.width() || gmxVar.a() == rectC.height()) && ((gmxVar.b() >= rectC.width() || gmxVar.a() >= rectC.height()) && (gmxVar.b() != rectC.width() || gmxVar.a() != rectC.height())))) {
                    Rect bounds2 = foldingFeature2.getBounds();
                    bounds2.getClass();
                    gnoVar = new gno(new gmx(bounds2), gnnVar, gnlVar);
                }
            }
            if (gnoVar != null) {
                arrayList.add(gnoVar);
            }
        }
        return new gns(arrayList);
    }

    public static gns S(Context context, WindowLayoutInfo windowLayoutInfo) {
        gon gonVar = Build.VERSION.SDK_INT >= 34 ? gon.b : gon.a;
        yfm.r(1, 2, 4, 8, 16, 32, 64, 128);
        if (Build.VERSION.SDK_INT >= 30) {
            return R(K().b(context, gonVar), windowLayoutInfo);
        }
        if (Build.VERSION.SDK_INT < 29 || !(context instanceof Activity)) {
            throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
        }
        return R(K().a((Activity) context, gonVar), windowLayoutInfo);
    }

    public static void T(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            ArrayList arrayList2 = new ArrayList(yfm.z(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new gnh(iIntValue, ((Number) it2.next()).intValue()));
            }
            yfm.I(arrayList, arrayList2);
        }
        yfm.aq(arrayList);
    }

    public static ghu X(nxb nxbVar, SQLiteDatabase sQLiteDatabase) {
        nxbVar.getClass();
        Object obj = nxbVar.a;
        if (obj != null) {
            ghu ghuVar = (ghu) obj;
            if (yks.e(ghuVar.d, sQLiteDatabase)) {
                return ghuVar;
            }
        }
        ghu ghuVar2 = new ghu(sQLiteDatabase);
        nxbVar.a = ghuVar2;
        return ghuVar2;
    }

    public static glk d(Bundle bundle) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(gli.class.getClassLoader());
            Parcelable parcelable = bundle2.getParcelable("a");
            if (parcelable instanceof ParcelImpl) {
                return ((ParcelImpl) parcelable).a;
            }
            throw new IllegalArgumentException("Invalid parcel");
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static void e(Bundle bundle, glk glkVar) {
        if (glkVar == null) {
            bundle.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", null);
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("a", new ParcelImpl(glkVar));
        bundle.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle2);
    }

    public static Interpolator g(Context context, int i) throws Resources.NotFoundException {
        Interpolator interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, i);
        a.ar(interpolatorLoadInterpolator, "Failed to parse interpolator, no start tag found");
        return interpolatorLoadInterpolator;
    }

    public static void h(gjr gjrVar, gju gjuVar) {
        gjrVar.b(gjuVar);
    }

    public static void i(gjr gjrVar, gju gjuVar) {
        gjrVar.e(gjuVar);
    }

    public static ArrayList j(ArrayList arrayList, Object obj) {
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (!arrayList.contains(obj)) {
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static void k(ViewGroup viewGroup) {
        viewGroup.setTag(R.id.transition_current_scene, null);
    }

    public static Path l(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    public static ObjectAnimator m(Object obj, Property property, Path path) {
        return ObjectAnimator.ofObject(obj, (Property<Object, V>) property, (TypeConverter) null, path);
    }

    public static void n(String str) {
        str.getClass();
        Trace.beginSection(q(str));
    }

    public static boolean o() throws Throwable {
        if (Build.VERSION.SDK_INT >= 29) {
            return Trace.isEnabled();
        }
        try {
            if (a == null) {
                q = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                a = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            Method method = a;
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Object objInvoke = method.invoke(null, Long.valueOf(q));
            objInvoke.getClass();
            return ((Boolean) objInvoke).booleanValue();
        } catch (Exception e) {
            p(e);
            return false;
        }
    }

    public static void p(Exception exc) throws Throwable {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw cause;
        }
    }

    public static String q(String str) {
        String str2 = str.length() <= 127 ? str : null;
        if (str2 != null) {
            return str2;
        }
        String strSubstring = str.substring(0, 127);
        strSubstring.getClass();
        return strSubstring;
    }

    public static Method r() {
        return (Method) ghu.c.a();
    }

    public static Method s() {
        return (Method) ghu.b.a();
    }

    public static ghm t(Context context, String str, ghl ghlVar, boolean z, boolean z2) {
        if (z && (str == null || str.length() == 0)) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new ghm(context, str, ghlVar, z, z2);
    }

    public static uhp u(final Executor executor, final String str, final yjk yjkVar) {
        executor.getClass();
        return cqv.w(new coo() { // from class: gph
            @Override // defpackage.coo
            public final Object a(com comVar) {
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                comVar.a(new gfe(atomicBoolean, 6), gpc.a);
                executor.execute(new bd((Object) atomicBoolean, (Object) comVar, (Object) yjkVar, 10, (byte[]) null));
                return str;
            }
        });
    }

    public static /* synthetic */ uhp v(yil yilVar, yjz yjzVar) {
        yilVar.getClass();
        return cqv.w(new gqd(yilVar, yjzVar, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static gox w(byte[] bArr) {
        Object utf;
        int length = bArr.length;
        if (length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        if (length == 0) {
            return gox.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            byte[] bArr2 = new byte[2];
            byteArrayInputStream.read(bArr2);
            boolean z = bArr2[0] == -84 && bArr2[1] == -19;
            byteArrayInputStream.reset();
            if (z) {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i = objectInputStream.readInt();
                    for (int i2 = 0; i2 < i; i2++) {
                        linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                    }
                    wef.v(objectInputStream, null);
                } finally {
                }
            } else {
                DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                try {
                    short s2 = dataInputStream.readShort();
                    if (s2 != -21521) {
                        throw new IllegalStateException(a.cf(s2, "Magic number doesn't match: "));
                    }
                    short s3 = dataInputStream.readShort();
                    if (s3 != 1) {
                        throw new IllegalStateException(a.cf(s3, "Unsupported version number: "));
                    }
                    int i3 = dataInputStream.readInt();
                    for (int i4 = 0; i4 < i3; i4++) {
                        byte b = dataInputStream.readByte();
                        if (b == 0) {
                            utf = null;
                        } else if (b == 1) {
                            utf = Boolean.valueOf(dataInputStream.readBoolean());
                        } else if (b == 2) {
                            utf = Byte.valueOf(dataInputStream.readByte());
                        } else if (b == 3) {
                            utf = Integer.valueOf(dataInputStream.readInt());
                        } else if (b == 4) {
                            utf = Long.valueOf(dataInputStream.readLong());
                        } else if (b == 5) {
                            utf = Float.valueOf(dataInputStream.readFloat());
                        } else if (b == 6) {
                            utf = Double.valueOf(dataInputStream.readDouble());
                        } else if (b == 7) {
                            utf = dataInputStream.readUTF();
                        } else if (b == 8) {
                            int i5 = dataInputStream.readInt();
                            Boolean[] boolArr = new Boolean[i5];
                            for (int i6 = 0; i6 < i5; i6++) {
                                boolArr[i6] = Boolean.valueOf(dataInputStream.readBoolean());
                            }
                            utf = (Serializable) boolArr;
                        } else if (b == 9) {
                            int i7 = dataInputStream.readInt();
                            Byte[] bArr3 = new Byte[i7];
                            for (int i8 = 0; i8 < i7; i8++) {
                                bArr3[i8] = Byte.valueOf(dataInputStream.readByte());
                            }
                            utf = (Serializable) bArr3;
                        } else if (b == 10) {
                            int i9 = dataInputStream.readInt();
                            Integer[] numArr = new Integer[i9];
                            for (int i10 = 0; i10 < i9; i10++) {
                                numArr[i10] = Integer.valueOf(dataInputStream.readInt());
                            }
                            utf = (Serializable) numArr;
                        } else if (b == 11) {
                            int i11 = dataInputStream.readInt();
                            Long[] lArr = new Long[i11];
                            for (int i12 = 0; i12 < i11; i12++) {
                                lArr[i12] = Long.valueOf(dataInputStream.readLong());
                            }
                            utf = (Serializable) lArr;
                        } else if (b == 12) {
                            int i13 = dataInputStream.readInt();
                            Float[] fArr = new Float[i13];
                            for (int i14 = 0; i14 < i13; i14++) {
                                fArr[i14] = Float.valueOf(dataInputStream.readFloat());
                            }
                            utf = (Serializable) fArr;
                        } else if (b == 13) {
                            int i15 = dataInputStream.readInt();
                            Double[] dArr = new Double[i15];
                            for (int i16 = 0; i16 < i15; i16++) {
                                dArr[i16] = Double.valueOf(dataInputStream.readDouble());
                            }
                            utf = (Serializable) dArr;
                        } else {
                            if (b != 14) {
                                throw new IllegalStateException(a.cf(b, "Unsupported type "));
                            }
                            int i17 = dataInputStream.readInt();
                            String[] strArr = new String[i17];
                            for (int i18 = 0; i18 < i17; i18++) {
                                String utf2 = dataInputStream.readUTF();
                                if (true == yks.e(utf2, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                                    utf2 = null;
                                }
                                strArr[i18] = utf2;
                            }
                            utf = (Serializable) strArr;
                        }
                        linkedHashMap.put(dataInputStream.readUTF(), utf);
                    }
                    wef.v(dataInputStream, null);
                } finally {
                }
            }
        } catch (IOException e) {
            String str = goy.a;
            gpn.b();
            Log.e(str, "Error in Data#fromByteArray: ", e);
        } catch (ClassNotFoundException e2) {
            String str2 = goy.a;
            gpn.b();
            Log.e(str2, "Error in Data#fromByteArray: ", e2);
        }
        return new gox(linkedHashMap);
    }

    public static byte[] x(gox goxVar) {
        int i;
        goxVar.getClass();
        int i2 = 0;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                int i3 = 1;
                dataOutputStream.writeShort(1);
                Map map = goxVar.b;
                dataOutputStream.writeInt(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value == null) {
                        dataOutputStream.writeByte(i2);
                    } else if (value instanceof Boolean) {
                        dataOutputStream.writeByte(i3);
                        dataOutputStream.writeBoolean(((Boolean) value).booleanValue());
                    } else if (value instanceof Byte) {
                        dataOutputStream.writeByte(2);
                        dataOutputStream.writeByte(((Number) value).byteValue());
                    } else if (value instanceof Integer) {
                        dataOutputStream.writeByte(3);
                        dataOutputStream.writeInt(((Number) value).intValue());
                    } else if (value instanceof Long) {
                        dataOutputStream.writeByte(4);
                        dataOutputStream.writeLong(((Number) value).longValue());
                    } else if (value instanceof Float) {
                        dataOutputStream.writeByte(5);
                        dataOutputStream.writeFloat(((Number) value).floatValue());
                    } else if (value instanceof Double) {
                        dataOutputStream.writeByte(6);
                        dataOutputStream.writeDouble(((Number) value).doubleValue());
                    } else if (value instanceof String) {
                        dataOutputStream.writeByte(7);
                        dataOutputStream.writeUTF((String) value);
                    } else {
                        if (!(value instanceof Object[])) {
                            Class<?> cls = value.getClass();
                            int i4 = ylg.a;
                            throw new IllegalArgumentException("Unsupported value type ".concat(String.valueOf(new ykl(cls).c())));
                        }
                        Object[] objArr = (Object[]) value;
                        Class<?> cls2 = objArr.getClass();
                        int i5 = ylg.a;
                        ykl yklVar = new ykl(cls2);
                        int i6 = 11;
                        int i7 = 10;
                        int i8 = 8;
                        if (yks.e(yklVar, new ykl(Boolean[].class))) {
                            i = 8;
                        } else if (yks.e(yklVar, new ykl(Byte[].class))) {
                            i = 9;
                        } else if (yks.e(yklVar, new ykl(Integer[].class))) {
                            i = 10;
                        } else if (yks.e(yklVar, new ykl(Long[].class))) {
                            i = 11;
                        } else if (yks.e(yklVar, new ykl(Float[].class))) {
                            i = 12;
                        } else if (yks.e(yklVar, new ykl(Double[].class))) {
                            i = 13;
                        } else {
                            if (!yks.e(yklVar, new ykl(String[].class))) {
                                throw new IllegalArgumentException("Unsupported value type ".concat(String.valueOf(new ykl(objArr.getClass()).b())));
                            }
                            i = 14;
                        }
                        dataOutputStream.writeByte(i);
                        int length = objArr.length;
                        dataOutputStream.writeInt(length);
                        int i9 = 0;
                        while (i9 < length) {
                            Object obj = objArr[i9];
                            if (i == i8) {
                                Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                                dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                            } else if (i == 9) {
                                Byte b = obj instanceof Byte ? (Byte) obj : null;
                                dataOutputStream.writeByte(b != null ? b.byteValue() : (byte) 0);
                            } else if (i == i7) {
                                Integer num = obj instanceof Integer ? (Integer) obj : null;
                                dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                            } else if (i == i6) {
                                Long l = obj instanceof Long ? (Long) obj : null;
                                dataOutputStream.writeLong(l != null ? l.longValue() : 0L);
                            } else if (i == 12) {
                                Float f = obj instanceof Float ? (Float) obj : null;
                                dataOutputStream.writeFloat(f != null ? f.floatValue() : 0.0f);
                            } else if (i == 13) {
                                Double d = obj instanceof Double ? (Double) obj : null;
                                dataOutputStream.writeDouble(d != null ? d.doubleValue() : 0.0d);
                            } else {
                                String str2 = obj instanceof String ? (String) obj : null;
                                if (str2 == null) {
                                    str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                                }
                                dataOutputStream.writeUTF(str2);
                            }
                            i9++;
                            i8 = 8;
                            i6 = 11;
                            i7 = 10;
                        }
                    }
                    dataOutputStream.writeUTF(str);
                    i2 = 0;
                    i3 = 1;
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() > 10240) {
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                wef.v(dataOutputStream, null);
                byteArray.getClass();
                return byteArray;
            } finally {
            }
        } catch (IOException e) {
            String str3 = goy.a;
            gpn.b();
            Log.e(str3, "Error in Data#toByteArray: ", e);
            return new byte[0];
        }
    }

    public static gox y(Map map) {
        gox goxVar = new gox(map);
        x(goxVar);
        return goxVar;
    }

    public static void z(String str, Object obj, Map map) {
        Object[] objArr;
        str.getClass();
        if (obj == null) {
            obj = null;
        } else {
            int i = ylg.a;
            ykl yklVar = new ykl(obj.getClass());
            if (!yks.e(yklVar, new ykl(Boolean.TYPE)) && !yks.e(yklVar, new ykl(Byte.TYPE)) && !yks.e(yklVar, new ykl(Integer.TYPE)) && !yks.e(yklVar, new ykl(Long.TYPE)) && !yks.e(yklVar, new ykl(Float.TYPE)) && !yks.e(yklVar, new ykl(Double.TYPE)) && !yks.e(yklVar, new ykl(String.class)) && !yks.e(yklVar, new ykl(Boolean[].class)) && !yks.e(yklVar, new ykl(Byte[].class)) && !yks.e(yklVar, new ykl(Integer[].class)) && !yks.e(yklVar, new ykl(Long[].class)) && !yks.e(yklVar, new ykl(Float[].class)) && !yks.e(yklVar, new ykl(Double[].class)) && !yks.e(yklVar, new ykl(String[].class))) {
                int i2 = 0;
                if (yks.e(yklVar, new ykl(boolean[].class))) {
                    boolean[] zArr = (boolean[]) obj;
                    int length = zArr.length;
                    String str2 = goy.a;
                    objArr = new Boolean[length];
                    while (i2 < length) {
                        objArr[i2] = Boolean.valueOf(zArr[i2]);
                        i2++;
                    }
                } else if (yks.e(yklVar, new ykl(byte[].class))) {
                    obj = goy.a((byte[]) obj);
                } else if (yks.e(yklVar, new ykl(int[].class))) {
                    int[] iArr = (int[]) obj;
                    int length2 = iArr.length;
                    String str3 = goy.a;
                    objArr = new Integer[length2];
                    while (i2 < length2) {
                        objArr[i2] = Integer.valueOf(iArr[i2]);
                        i2++;
                    }
                } else if (yks.e(yklVar, new ykl(long[].class))) {
                    long[] jArr = (long[]) obj;
                    int length3 = jArr.length;
                    String str4 = goy.a;
                    objArr = new Long[length3];
                    while (i2 < length3) {
                        objArr[i2] = Long.valueOf(jArr[i2]);
                        i2++;
                    }
                } else if (yks.e(yklVar, new ykl(float[].class))) {
                    float[] fArr = (float[]) obj;
                    int length4 = fArr.length;
                    String str5 = goy.a;
                    objArr = new Float[length4];
                    while (i2 < length4) {
                        objArr[i2] = Float.valueOf(fArr[i2]);
                        i2++;
                    }
                } else {
                    if (!yks.e(yklVar, new ykl(double[].class))) {
                        throw new IllegalArgumentException("Key " + str + " has invalid type " + yklVar);
                    }
                    double[] dArr = (double[]) obj;
                    int length5 = dArr.length;
                    String str6 = goy.a;
                    objArr = new Double[length5];
                    while (i2 < length5) {
                        objArr[i2] = Double.valueOf(dArr[i2]);
                        i2++;
                    }
                }
                obj = objArr;
            }
        }
        map.put(str, obj);
    }

    public void W(int i) {
        throw null;
    }

    public boolean b() {
        return false;
    }

    public boolean c(int[] iArr) {
        return false;
    }

    public boolean f(int i) {
        throw null;
    }

    public gli(char[] cArr) {
    }

    public void U(int i) {
    }

    public void V(int i, float f, int i2) {
    }
}
