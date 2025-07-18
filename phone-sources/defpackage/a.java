package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.compose.material3.internal.ChildSemanticsNodeElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes.dex */
public class a {
    public a() {
    }

    public static /* synthetic */ boolean A(int i) {
        return r(i, 2) || r(i, 4) || r(i, 5);
    }

    public static /* synthetic */ boolean C(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }

    public static /* synthetic */ long D(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
    }

    public static /* synthetic */ void E(Appendable appendable, Object obj, yjv yjvVar) throws IOException {
        if (yjvVar != null) {
            appendable.append((CharSequence) yjvVar.a(obj));
            return;
        }
        if (obj == null || (obj instanceof CharSequence)) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }

    public static /* synthetic */ boolean F(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ Object G(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static /* synthetic */ void H(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static /* synthetic */ void I(Iterable iterable, List list) {
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
        }
        int size = list.size();
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (list.size() - size) + " is null.";
                int size2 = list.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        throw new NullPointerException(str);
                    }
                    list.remove(size2);
                }
            } else {
                list.add(obj);
            }
        }
    }

    public static /* synthetic */ int J(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(cd(i, "Beginning index: ", " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(ce(i2, i, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(ce(i3, i2, "End index: ", " >= "));
    }

    public static /* synthetic */ void K(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i >= 0) {
                throw new ArrayIndexOutOfBoundsException(ce(i2, i, "Index > length: ", ", "));
            }
            throw new ArrayIndexOutOfBoundsException(cf(i, "Index < 0: "));
        }
    }

    public static /* synthetic */ Object L(Method method, Object obj, Object[] objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static /* synthetic */ int M(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public static /* synthetic */ boolean N(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    public static /* synthetic */ String O(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toLowerCase(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    public static /* synthetic */ Field P(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static /* synthetic */ boolean Q(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static /* synthetic */ int R(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    public static /* synthetic */ int S(Object[] objArr, int i) {
        int iHashCode = 17;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode = (iHashCode * 31) + objArr[i2].hashCode();
        }
        return iHashCode;
    }

    public static /* synthetic */ boolean T(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean U(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ Unsafe V() throws IllegalAccessException, IllegalArgumentException {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        return null;
    }

    public static /* synthetic */ Field W(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ Object X(Object obj, djg djgVar) {
        return djgVar instanceof dsf ? djgVar : obj;
    }

    public static /* synthetic */ Object Y(Object obj, djg djgVar) {
        return djgVar instanceof dry ? djgVar : obj;
    }

    public static /* synthetic */ boolean Z(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static /* synthetic */ String a(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "SIMPLE";
            case 3:
                return "CHOICE";
            case 4:
                return "PLURAL";
            case 5:
                return "SELECT";
            case 6:
                return "SELECTORDINAL";
            default:
                return "null";
        }
    }

    public static /* synthetic */ void aA(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(ce(i2, i, "index: ", ", size: "));
        }
    }

    public static /* synthetic */ void aB(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(ce(i2, i, "index: ", ", size: "));
        }
    }

    public static /* synthetic */ void aC(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i > i2) {
                throw new IllegalArgumentException(ce(i2, i, "fromIndex: ", " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
    }

    public static /* synthetic */ void aD(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static /* synthetic */ int aE(int i) {
        return i - 2;
    }

    public static /* synthetic */ int aF(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static /* synthetic */ int aG(int i) {
        return i - 2;
    }

    public static /* synthetic */ int aH(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static /* synthetic */ int aI(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static /* synthetic */ int aJ(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static /* synthetic */ int aK(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i != 3) {
            return i != 4 ? 0 : 6;
        }
        return 5;
    }

    public static /* synthetic */ int aL(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static /* synthetic */ int aM(int i) {
        if (i == 0) {
            return 5;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i != 4) {
            return i != 5 ? 0 : 4;
        }
        return 3;
    }

    public static /* synthetic */ int aN(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int aO(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int aP(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int aQ(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i != 2) {
            return i != 3 ? 0 : 5;
        }
        return 4;
    }

    public static /* synthetic */ int aR(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return 0;
                    }
                }
            }
        }
        return i2;
    }

    public static /* synthetic */ int aS(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static /* synthetic */ int aT(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int aU(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 5;
        }
        if (i != 4) {
            return i != 5 ? 0 : 7;
        }
        return 6;
    }

    public static /* synthetic */ int aV(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 5 ? 0 : 6;
        }
        return 5;
    }

    public static /* synthetic */ int aW(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
            case 9:
            default:
                return 0;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
        }
    }

    public static /* synthetic */ int aX(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 3;
        }
        return 2;
    }

    public static /* synthetic */ int aY(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static /* synthetic */ int[] aZ() {
        return new int[]{1, 2, 3};
    }

    public static /* synthetic */ ComponentName aa(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers.size() == 1) {
            ResolveInfo resolveInfo = listQueryBroadcastReceivers.get(0);
            return new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        }
        if (listQueryBroadcastReceivers.size() <= 1) {
            return null;
        }
        Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
        return null;
    }

    public static /* synthetic */ void ab(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static /* synthetic */ String ac(Iterable iterable) {
        StringBuilder sb = new StringBuilder();
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            sb.append((CharSequence) it.next());
            while (it.hasNext()) {
                sb.append((CharSequence) ", ");
                sb.append((CharSequence) it.next());
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0145, code lost:
    
        if (r3.equals("YE") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x015d, code lost:
    
        if (r3.equals("WS") != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0167, code lost:
    
        if (r3.equals("WF") != false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0171, code lost:
    
        if (r3.equals("VU") != false) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01a5, code lost:
    
        if (r3.equals("VE") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01af, code lost:
    
        if (r3.equals("VC") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01b9, code lost:
    
        if (r3.equals("VA") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01fb, code lost:
    
        if (r3.equals("UA") != false) goto L815;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0221, code lost:
    
        if (r3.equals("TV") != false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0239, code lost:
    
        if (r3.equals("TR") != false) goto L889;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x025f, code lost:
    
        if (r3.equals("TM") != false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0269, code lost:
    
        if (r3.equals("TL") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0273, code lost:
    
        if (r3.equals("TJ") != false) goto L744;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x027d, code lost:
    
        if (r3.equals("TH") != false) goto L804;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0295, code lost:
    
        if (r3.equals("TD") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x02ad, code lost:
    
        if (r3.equals("SZ") != false) goto L866;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x02b7, code lost:
    
        if (r3.equals("SY") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x02c1, code lost:
    
        if (r3.equals("SX") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x02e7, code lost:
    
        if (r3.equals("SS") != false) goto L656;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x031b, code lost:
    
        if (r3.equals("SM") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0325, code lost:
    
        if (r3.equals("SL") != false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x033d, code lost:
    
        if (r3.equals("SJ") != false) goto L708;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0347, code lost:
    
        if (r3.equals("SI") != false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0351, code lost:
    
        if (r3.equals("SH") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0369, code lost:
    
        if (r3.equals("SE") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0373, code lost:
    
        if (r3.equals("SD") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x037d, code lost:
    
        if (r3.equals("SC") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        if (r3.equals("CI") != false) goto L862;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0387, code lost:
    
        if (r3.equals("SB") != false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x038e, code lost:
    
        return new int[]{4, 2, 4, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x03f7, code lost:
    
        if (r3.equals("PY") != false) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x040f, code lost:
    
        if (r3.equals("PT") != false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0435, code lost:
    
        if (r3.equals("PM") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0469, code lost:
    
        if (r3.equals("PG") != false) goto L497;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0057, code lost:
    
        if (r3.equals("CG") != false) goto L732;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x048f, code lost:
    
        if (r3.equals("PA") != false) goto L901;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x04b5, code lost:
    
        if (r3.equals("NU") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x04bf, code lost:
    
        if (r3.equals("NR") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x04f3, code lost:
    
        if (r3.equals("NI") != false) goto L788;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x050b, code lost:
    
        if (r3.equals("NF") != false) goto L708;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0515, code lost:
    
        if (r3.equals("NE") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x051f, code lost:
    
        if (r3.equals("NC") != false) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x0526, code lost:
    
        return new int[]{2, 3, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x053b, code lost:
    
        if (r3.equals("MZ") != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0542, code lost:
    
        return new int[]{3, 1, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x058f, code lost:
    
        if (r3.equals("MT") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0599, code lost:
    
        if (r3.equals("MS") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x05a3, code lost:
    
        if (r3.equals("MR") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x05bb, code lost:
    
        if (r3.equals("MP") != false) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x05c2, code lost:
    
        return new int[]{1, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x05e5, code lost:
    
        if (r3.equals("MM") != false) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x05ef, code lost:
    
        if (r3.equals("ML") != false) goto L811;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x0607, code lost:
    
        if (r3.equals("MH") != false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x060e, code lost:
    
        return new int[]{4, 2, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x0615, code lost:
    
        if (r3.equals("MG") != false) goto L732;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x0649, code lost:
    
        if (r3.equals("MC") != false) goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0661, code lost:
    
        if (r3.equals("LY") != false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x066b, code lost:
    
        if (r3.equals("LV") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0691, code lost:
    
        if (r3.equals("LS") != false) goto L497;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x0698, code lost:
    
        return new int[]{4, 3, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x069f, code lost:
    
        if (r3.equals("LR") != false) goto L748;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x06a9, code lost:
    
        if (r3.equals("LK") != false) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x06b0, code lost:
    
        return new int[]{3, 2, 3, 3, 4, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x06b7, code lost:
    
        if (r3.equals("LI") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x06f9, code lost:
    
        if (r3.equals("KY") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x0703, code lost:
    
        if (r3.equals("KW") != false) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0099, code lost:
    
        if (r3.equals("BQ") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x071b, code lost:
    
        if (r3.equals("KN") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x0725, code lost:
    
        if (r3.equals("KM") != false) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x072c, code lost:
    
        return new int[]{4, 3, 3, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x0733, code lost:
    
        if (r3.equals("KI") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x0775, code lost:
    
        if (r3.equals("JO") != false) goto L889;
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x078d, code lost:
    
        if (r3.equals("JE") != false) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x07a5, code lost:
    
        if (r3.equals("IS") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:595:0x07e7, code lost:
    
        if (r3.equals("IM") != false) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x081b, code lost:
    
        if (r3.equals("HU") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x0825, code lost:
    
        if (r3.equals("HT") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x082f, code lost:
    
        if (r3.equals("HR") != false) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x0836, code lost:
    
        return new int[]{1, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x0891, code lost:
    
        if (r3.equals("GQ") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:655:0x08b7, code lost:
    
        if (r3.equals("GM") != false) goto L656;
     */
    /* JADX WARN: Code restructure failed: missing block: B:657:0x08be, code lost:
    
        return new int[]{4, 3, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:659:0x08c5, code lost:
    
        if (r3.equals("GL") != false) goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x08cc, code lost:
    
        return new int[]{1, 2, 2, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:663:0x08d3, code lost:
    
        if (r3.equals("GI") != false) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:665:0x08da, code lost:
    
        return new int[]{0, 2, 0, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00cd, code lost:
    
        if (r3.equals("BL") != false) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:707:0x096d, code lost:
    
        if (r3.equals("FK") != false) goto L708;
     */
    /* JADX WARN: Code restructure failed: missing block: B:709:0x0974, code lost:
    
        return new int[]{3, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:727:0x09b3, code lost:
    
        if (r3.equals("ER") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:729:0x09ba, code lost:
    
        return new int[]{4, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:731:0x09c1, code lost:
    
        if (r3.equals("EG") != false) goto L732;
     */
    /* JADX WARN: Code restructure failed: missing block: B:733:0x09c8, code lost:
    
        return new int[]{3, 4, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:735:0x09cf, code lost:
    
        if (r3.equals("EE") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:737:0x09d6, code lost:
    
        return new int[]{0, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:743:0x09eb, code lost:
    
        if (r3.equals("DZ") != false) goto L744;
     */
    /* JADX WARN: Code restructure failed: missing block: B:745:0x09f2, code lost:
    
        return new int[]{3, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:747:0x09f9, code lost:
    
        if (r3.equals("DO") != false) goto L748;
     */
    /* JADX WARN: Code restructure failed: missing block: B:749:0x0a00, code lost:
    
        return new int[]{3, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e5, code lost:
    
        if (r3.equals("AT") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:751:0x0a07, code lost:
    
        if (r3.equals("DM") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:758:0x0a1f, code lost:
    
        if (r3.equals("DJ") != false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:773:0x0a53, code lost:
    
        if (r3.equals("CX") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:776:0x0a5d, code lost:
    
        if (r3.equals("CW") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:783:0x0a75, code lost:
    
        if (r3.equals("CU") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:785:0x0a7c, code lost:
    
        return new int[]{4, 2, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:787:0x0a83, code lost:
    
        if (r3.equals("CR") != false) goto L788;
     */
    /* JADX WARN: Code restructure failed: missing block: B:789:0x0a8a, code lost:
    
        return new int[]{2, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:799:0x0aad, code lost:
    
        if (r3.equals("CM") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:801:0x0ab4, code lost:
    
        return new int[]{4, 3, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:803:0x0abb, code lost:
    
        if (r3.equals("CL") != false) goto L804;
     */
    /* JADX WARN: Code restructure failed: missing block: B:805:0x0ac2, code lost:
    
        return new int[]{0, 1, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:807:0x0ac9, code lost:
    
        if (r3.equals("CK") != false) goto L877;
     */
    /* JADX WARN: Code restructure failed: missing block: B:810:0x0ad3, code lost:
    
        if (r3.equals("CD") != false) goto L811;
     */
    /* JADX WARN: Code restructure failed: missing block: B:812:0x0ada, code lost:
    
        return new int[]{3, 3, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:814:0x0ae1, code lost:
    
        if (r3.equals("CA") != false) goto L815;
     */
    /* JADX WARN: Code restructure failed: missing block: B:816:0x0ae8, code lost:
    
        return new int[]{0, 2, 1, 2, 3, 3};
     */
    /* JADX WARN: Code restructure failed: missing block: B:826:0x0b0b, code lost:
    
        if (r3.equals("BI") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:828:0x0b12, code lost:
    
        return new int[]{4, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:834:0x0b27, code lost:
    
        if (r3.equals("BG") != false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:836:0x0b2e, code lost:
    
        return new int[]{0, 0, 0, 0, 1, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:838:0x0b35, code lost:
    
        if (r3.equals("BF") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:840:0x0b3c, code lost:
    
        return new int[]{4, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:850:0x0b5f, code lost:
    
        if (r3.equals("AZ") != false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:852:0x0b66, code lost:
    
        return new int[]{4, 2, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:858:0x0b7b, code lost:
    
        if (r3.equals("AI") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x010b, code lost:
    
        if (r3.equals("AQ") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:861:0x0b84, code lost:
    
        if (r3.equals("AG") != false) goto L862;
     */
    /* JADX WARN: Code restructure failed: missing block: B:863:0x0b8b, code lost:
    
        return new int[]{2, 4, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:865:0x0b92, code lost:
    
        if (r3.equals("AF") != false) goto L866;
     */
    /* JADX WARN: Code restructure failed: missing block: B:867:0x0b99, code lost:
    
        return new int[]{4, 4, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:873:0x0bae, code lost:
    
        if (r3.equals("AD") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:876:0x0bb7, code lost:
    
        if (r3.equals("BZ") != false) goto L877;
     */
    /* JADX WARN: Code restructure failed: missing block: B:878:0x0bbe, code lost:
    
        return new int[]{2, 2, 2, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:884:0x0bd3, code lost:
    
        if (r3.equals("BB") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:886:0x0bda, code lost:
    
        return new int[]{1, 2, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:888:0x0be1, code lost:
    
        if (r3.equals("BA") != false) goto L889;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0115, code lost:
    
        if (r3.equals("ZW") != false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:890:0x0be8, code lost:
    
        return new int[]{1, 1, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:892:0x0bef, code lost:
    
        if (r3.equals("AX") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:894:0x0bf6, code lost:
    
        return new int[]{0, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:900:0x0c0b, code lost:
    
        if (r3.equals("AM") != false) goto L901;
     */
    /* JADX WARN: Code restructure failed: missing block: B:902:0x0c12, code lost:
    
        return new int[]{2, 3, 2, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x013b, code lost:
    
        if (r3.equals("YT") != false) goto L390;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ int[] ad(java.lang.String r3) {
        /*
            Method dump skipped, instructions count: 6672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a.ad(java.lang.String):int[]");
    }

    public static /* synthetic */ PorterDuff.Mode ae(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static /* synthetic */ void af(Closeable closeable) throws IOException {
        closeable.getClass();
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ String ag(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            default:
                return "END_DOCUMENT";
        }
    }

    public static /* synthetic */ void ah(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static /* synthetic */ boolean ai(String str, List list) {
        Object next;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (yks.e(((wkc) next).d, str)) {
                break;
            }
        }
        return ((wkc) next) != null;
    }

    public static /* synthetic */ Context aj(View view) {
        Context context;
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null && (context = view2.getContext()) != null) {
            return context;
        }
        Context context2 = view.getContext();
        context2.getClass();
        return context2;
    }

    public static /* synthetic */ bcb ak() {
        return new bci(false, bcz.c);
    }

    public static /* synthetic */ String al(dwi dwiVar) {
        String str = (String) dwiVar.b("referrer");
        return str == null ? "" : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean am(ImmutableList immutableList, String str) {
        UnmodifiableIterator it = immutableList.iterator();
        while (it.hasNext()) {
            if (str.equals(Locale.forLanguageTag((String) it.next()).getLanguage())) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ wpm ao(String str) {
        vtw vtwVarM = wpm.a.m();
        vtw vtwVarM2 = wpl.a.m();
        vtw vtwVarM3 = wni.a.m();
        if (!vtwVarM3.b.A()) {
            vtwVarM3.u();
        }
        vuc vucVar = vtwVarM3.b;
        ((wni) vucVar).b = str;
        if (!vucVar.A()) {
            vtwVarM3.u();
        }
        ((wni) vtwVarM3.b).c = aJ(3);
        wni wniVar = (wni) vtwVarM3.r();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        wpl wplVar = (wpl) vtwVarM2.b;
        wniVar.getClass();
        wplVar.c = wniVar;
        wplVar.b |= 1;
        wpl wplVar2 = (wpl) vtwVarM2.r();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wpm wpmVar = (wpm) vtwVarM.b;
        wplVar2.getClass();
        wpmVar.g = wplVar2;
        wpmVar.b |= 4;
        vtw vtwVarM4 = woz.a.m();
        vtwVarM4.aQ(wnt.a);
        woz wozVar = (woz) vtwVarM4.r();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wpm wpmVar2 = (wpm) vtwVarM.b;
        wozVar.getClass();
        wpmVar2.d = wozVar;
        wpmVar2.c = 4;
        return (wpm) vtwVarM.r();
    }

    public static /* synthetic */ ygi ap(cfc cfcVar) {
        cfk.k(cfcVar, 0);
        return ygi.a;
    }

    public static /* synthetic */ void ar(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static /* synthetic */ int as(int i) {
        if (i == 0) {
            return 2;
        }
        if (i != 1) {
            return i != 2 ? 0 : 4;
        }
        return 3;
    }

    public static /* synthetic */ long at(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
    }

    public static /* synthetic */ boolean au(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static /* synthetic */ int[] av() {
        return new int[]{1, 2, 3, 4, 5, 6};
    }

    public static /* synthetic */ boolean aw(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static /* synthetic */ Object ax(Object obj, Object obj2) {
        bao baoVar = (bao) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && baoVar.K()) {
            baoVar.t();
        }
        return ygi.a;
    }

    public static /* synthetic */ Object ay(Object obj, Object obj2) {
        bao baoVar = (bao) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (!baoVar.L((iIntValue & 3) != 2, iIntValue & 1)) {
            baoVar.t();
        }
        return ygi.a;
    }

    public static boolean b(int i) {
        return i == 4 || i == 6;
    }

    public static /* synthetic */ String bA(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "REMOVING" : "ADDING" : "NONE";
    }

    public static dp bD(ViewGroup viewGroup, d dVar) {
        dVar.getClass();
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof dp) {
            return (dp) tag;
        }
        dp dpVar = new dp(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, dpVar);
        return dpVar;
    }

    public static void bE(long j, Parcel parcel) {
        long jC = cmk.c(j);
        byte b = 0;
        if (!s(jC, 0L)) {
            if (s(jC, 4294967296L)) {
                b = 1;
            } else if (s(jC, 8589934592L)) {
                b = 2;
            }
        }
        parcel.writeByte(b);
        if (s(cmk.c(j), 0L)) {
            return;
        }
        parcel.writeFloat(cmk.a(j));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object bF(defpackage.vs r5, float r6, defpackage.yih r7) {
        /*
            boolean r0 = r7 instanceof defpackage.va
            if (r0 == 0) goto L13
            r0 = r7
            va r0 = (defpackage.va) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            va r0 = new va
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ylc r5 = r0.c
            defpackage.ybn.f(r7)
            goto L4a
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ybn.f(r7)
            ylc r7 = new ylc
            r7.<init>()
            vb r2 = new vb
            r4 = 0
            r2.<init>(r7, r6, r4)
            r0.c = r7
            r0.b = r3
            java.lang.Object r5 = defpackage.og.o(r5, r2, r0)
            if (r5 == r1) goto L52
            r5 = r7
        L4a:
            float r5 = r5.a
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r5)
            return r6
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a.bF(vs, float, yih):java.lang.Object");
    }

    public static boolean bG(float f) {
        return Float.isNaN(f) || Math.abs(f) < 0.5f;
    }

    public static bdy bH(kw kwVar, bao baoVar, int i) {
        kw kwVar2;
        bas basVar = (bas) baoVar;
        Object objT = basVar.T();
        Object obj = ban.a;
        if (objT == obj) {
            bci bciVar = new bci(false, bcz.c);
            basVar.ae(bciVar);
            objT = bciVar;
        }
        bcb bcbVar = (bcb) objT;
        boolean z = (((i & 14) ^ 6) > 4 && baoVar.F(kwVar)) || (i & 6) == 4;
        Object objT2 = basVar.T();
        if (z || objT2 == obj) {
            kwVar2 = kwVar;
            qd qdVar = new qd(kwVar2, bcbVar, (yih) null, 9, (char[]) null);
            basVar.ae(qdVar);
            objT2 = qdVar;
        } else {
            kwVar2 = kwVar;
        }
        bbn.f(kwVar2, (yjz) objT2, baoVar);
        return bcbVar;
    }

    public static bdy bI(kw kwVar, bao baoVar, int i) {
        bas basVar = (bas) baoVar;
        Object objT = basVar.T();
        Object obj = ban.a;
        if (objT == obj) {
            bci bciVar = new bci(false, bcz.c);
            basVar.ae(bciVar);
            objT = bciVar;
        }
        bcb bcbVar = (bcb) objT;
        boolean z = (((i & 14) ^ 6) > 4 && baoVar.F(kwVar)) || (i & 6) == 4;
        Object objT2 = basVar.T();
        if (z || objT2 == obj) {
            objT2 = new qd(kwVar, bcbVar, (yih) null, 7);
            basVar.ae(objT2);
        }
        bbn.f(kwVar, (yjz) objT2, baoVar);
        return bcbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.cvw bJ(defpackage.cfy r18) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a.bJ(cfy):cvw");
    }

    public static bii bK(yjz yjzVar, yjv yjvVar) {
        xa xaVar = new xa(yjzVar, 14);
        ylh.d(yjvVar, 1);
        return new bij(xaVar, yjvVar);
    }

    public static long bL() {
        return Thread.currentThread().getId();
    }

    public static int bM(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static Object[] bN(Object[] objArr, int i, Object obj, Object obj2) {
        int length = objArr.length;
        Object[] objArr2 = new Object[length + 2];
        yfm.bu(objArr, objArr2, 0, i, 6);
        yfm.bj(objArr, objArr2, i + 2, i, length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static Object[] bO(Object[] objArr, int i) {
        int length = objArr.length;
        Object[] objArr2 = new Object[length - 2];
        yfm.bu(objArr, objArr2, 0, i, 6);
        yfm.bj(objArr, objArr2, i, i + 2, length);
        return objArr2;
    }

    public static Object[] bP(Object[] objArr, int i) {
        int length = objArr.length;
        Object[] objArr2 = new Object[length - 1];
        yfm.bu(objArr, objArr2, 0, i, 6);
        yfm.bj(objArr, objArr2, i, i + 1, length);
        return objArr2;
    }

    public static void bQ(bdj bdjVar, bad badVar, int i) {
        while (true) {
            int i2 = bdjVar.q;
            if (i > i2 && i < bdjVar.p) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            bdjVar.H();
            if (bdjVar.Q(bdjVar.q)) {
                badVar.h();
            }
            bdjVar.U();
        }
    }

    public static bdy bR(Object obj, bao baoVar) {
        Object objG = baoVar.g();
        if (objG == ban.a) {
            bci bciVar = new bci(obj, bcz.c);
            baoVar.A(bciVar);
            objG = bciVar;
        }
        bcb bcbVar = (bcb) objG;
        bcbVar.b(obj);
        return bcbVar;
    }

    public static ysx bS(yjk yjkVar) {
        return new ysq(new bdv(yjkVar, null));
    }

    public static bdy bT(ysx ysxVar, Object obj, yil yilVar, bao baoVar, int i) {
        if ((i & 2) != 0) {
            yilVar = yim.a;
        }
        boolean zH = baoVar.H(yilVar) | baoVar.H(ysxVar);
        Object objG = baoVar.g();
        if (zH || objG == ban.a) {
            objG = new axy(yilVar, ysxVar, (yih) null, 2);
            baoVar.A(objG);
        }
        yjz yjzVar = (yjz) objG;
        Object objG2 = baoVar.g();
        Object obj2 = ban.a;
        if (objG2 == obj2) {
            Object bciVar = new bci(obj, bcz.c);
            baoVar.A(bciVar);
            objG2 = bciVar;
        }
        bcb bcbVar = (bcb) objG2;
        boolean zH2 = baoVar.H(yjzVar);
        Object objG3 = baoVar.g();
        if (zH2 || objG3 == obj2) {
            Object ucVar = new uc(yjzVar, bcbVar, (yih) null, 8, (byte[]) null);
            baoVar.A(ucVar);
            objG3 = ucVar;
        }
        bbn.e(ysxVar, yilVar, (yjz) objG3, baoVar);
        return bcbVar;
    }

    public static /* synthetic */ bkp bU(bkp bkpVar) {
        return bkpVar.a(new ChildSemanticsNodeElement(new aru(13)));
    }

    public static void bV(yjz yjzVar, bao baoVar, int i) {
        int i2;
        bao baoVarD = baoVar.d(-1437916225);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.G(true) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 16 : 32;
        }
        if (baoVarD.L((i2 & 19) != 18, i2 & 1)) {
            hp.e(true, yjzVar, baoVarD, i2 & android.support.v7.appcompat.R.styleable.AppCompatTheme_windowNoTitle);
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new nu(yjzVar, i, 10);
        }
    }

    public static Object bW(ayd aydVar, Object obj, float f, yih yihVar) {
        Object objF = aydVar.f(obj, rv.a, new axv(aydVar, f, null), yihVar);
        return objF == yio.a ? objF : ygi.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object bX(defpackage.yjk r5, defpackage.yjz r6, defpackage.yih r7) {
        /*
            boolean r0 = r7 instanceof defpackage.axw
            if (r0 == 0) goto L13
            r0 = r7
            axw r0 = (defpackage.axw) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            axw r0 = new axw
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r7)     // Catch: defpackage.axu -> L42
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ybn.f(r7)
            axy r7 = new axy     // Catch: defpackage.axu -> L42
            r2 = 0
            r4 = 0
            r7.<init>(r5, r6, r2, r4)     // Catch: defpackage.axu -> L42
            r0.b = r3     // Catch: defpackage.axu -> L42
            java.lang.Object r5 = defpackage.yoz.k(r7, r0)     // Catch: defpackage.axu -> L42
            if (r5 != r1) goto L42
            return r1
        L42:
            ygi r5 = defpackage.ygi.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a.bX(yjk, yjz, yih):java.lang.Object");
    }

    public static axp bY(bao baoVar) {
        baoVar.x(280823976);
        long jCv = ((clx) baoVar.f(ccq.d)).cv(clw.y(((cdv) baoVar.f(ccq.n)).a()));
        bas basVar = (bas) baoVar;
        basVar.aa();
        int i = gnh.b;
        Set set = axm.a;
        Set set2 = axm.a;
        Set set3 = axl.a;
        Set set4 = axl.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set2) {
            if (Float.compare(cmc.b(jCv), ((cma) obj).a) >= 0) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fMax = ((cma) it.next()).a;
        while (it.hasNext()) {
            fMax = Math.max(fMax, ((cma) it.next()).a);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : set4) {
            if (Float.compare(cmc.a(jCv), ((cma) obj2).a) >= 0) {
                arrayList2.add(obj2);
            }
        }
        Iterator it2 = arrayList2.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        float fMax2 = ((cma) it2.next()).a;
        while (it2.hasNext()) {
            fMax2 = Math.max(fMax2, ((cma) it2.next()).a);
        }
        gnh gnhVar = new gnh((int) fMax, (int) fMax2);
        Context context = (Context) baoVar.f(AndroidCompositionLocals_androidKt.b);
        boolean zF = baoVar.F(context);
        Object objT = basVar.T();
        if (zF || objT == ban.a) {
            gnq gnqVarA = gnq.a.a(context);
            context.getClass();
            yss yssVar = new yss(new ajp((gnr) gnqVarA, context, (yih) null, 3));
            yot yotVar = ypk.a;
            objT = new dbm(vyf.H(yssVar, yxi.a), 1);
            basVar.ae(objT);
        }
        List<gnm> list = (List) bT((ysx) objT, yhb.a, null, baoVar, 2).a();
        ArrayList arrayList3 = new ArrayList();
        boolean z = false;
        for (gnm gnmVar : list) {
            if (yks.e(gnmVar.c(), gnk.b) && yks.e(gnmVar.d(), gnl.b)) {
                z = true;
            }
            arrayList3.add(new axn(bnj.p(gnmVar.a()), yks.e(gnmVar.d(), gnl.a), yks.e(gnmVar.c(), gnk.a), gnmVar.e(), yks.e(gnmVar.b(), gnj.b)));
        }
        return new axp(gnhVar, new axo(z, arrayList3));
    }

    public static void bZ(yjz yjzVar, yjz yjzVar2, bkp bkpVar, float f, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-595548358);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(yjzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjzVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.C(f) ? 1024 : 2048;
        }
        if (baoVarD.L((i2 & 1171) != 1170, i2 & 1)) {
            bkp bkpVarA = ask.a(bkpVar);
            int i4 = i2 & 7168;
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (i4 == 2048 || objT == ban.a) {
                objT = new awj(f);
                basVar.ae(objT);
            }
            bvt bvtVar = (bvt) objT;
            int iO = zy.o(baoVarD);
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVarA);
            yjk yjkVar = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVar, bxt.d);
            beb.a(baoVarD, bhuVarAi, bxt.c);
            yjz yjzVar3 = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iO))) {
                Integer numValueOf = Integer.valueOf(iO);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar3);
            }
            beb.a(baoVarD, bkpVarC, bxt.b);
            bcm.i(ask.c.c(new cma(0.0f)), bga.k(176801777, new awh(yjzVar, yjzVar2, 0), baoVarD), baoVarD, 56);
            baoVarD.o();
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kho(yjzVar, yjzVar2, bkpVar, f, i, 1);
        }
    }

    public static /* synthetic */ boolean ba(wpm wpmVar) {
        vun vunVar = (wpmVar.c == 4 ? (woz) wpmVar.d : woz.a).c;
        vunVar.getClass();
        return !vunVar.isEmpty();
    }

    public static /* synthetic */ int bb(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int bc(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int bd(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (i != 5) {
            return i != 7 ? 0 : 8;
        }
        return 6;
    }

    public static /* synthetic */ int be(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            default:
                return 0;
        }
    }

    public static /* synthetic */ Object bf(Object obj) {
        ((View) obj).getClass();
        return vrr.a;
    }

    public static /* synthetic */ int bg(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int bh(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int bi(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            default:
                return 0;
        }
    }

    public static /* synthetic */ Object bj(Object obj) {
        vxj vxjVar = vxj.a;
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        vtp vtpVar = vtp.a;
        vvs vvsVar = vvs.a;
        vuc vucVarP = vuc.p(vxjVar, bArr, 0, length, vtp.a);
        vuc.B(vucVarP);
        return (vxj) vucVarP;
    }

    public static /* synthetic */ Object bk(Object obj) {
        vxh vxhVar = vxh.a;
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        vtp vtpVar = vtp.a;
        vvs vvsVar = vvs.a;
        vuc vucVarP = vuc.p(vxhVar, bArr, 0, length, vtp.a);
        vuc.B(vucVarP);
        return (vxh) vucVarP;
    }

    public static /* synthetic */ void bl(int i) {
        if (i == 0) {
            throw null;
        }
    }

    public static /* synthetic */ int bm(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static /* synthetic */ int bn(int i) {
        if (i != 0) {
            return i;
        }
        throw null;
    }

    public static /* synthetic */ boolean bo(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                return true;
            default:
                return false;
        }
    }

    public static /* synthetic */ boolean bp(int i) {
        return bm(i) != 0;
    }

    public static /* synthetic */ boolean bq(int i) {
        return aS(i) != 0;
    }

    public static /* synthetic */ boolean br(int i) {
        return aL(i) != 0;
    }

    public static /* synthetic */ boolean bs(int i) {
        return aP(i) != 0;
    }

    public static /* synthetic */ boolean bt(int i) {
        return aV(i) != 0;
    }

    public static /* synthetic */ boolean bu(int i) {
        return bc(i) != 0;
    }

    public static /* synthetic */ boolean bv(int i) {
        return aY(i) != 0;
    }

    public static /* synthetic */ void bw(int i) {
        if (i == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void bx(tll tllVar, int i) {
        int i2 = tllVar.a;
        if (i2 == -1) {
            i2 = 2;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            adm admVar = (adm) tllVar.c;
            mma mmaVar = admVar.f;
            if (mmaVar != null) {
                List list = tllVar.b;
                eux euxVar = admVar.e;
                Object obj = mmaVar.b;
                if (obj instanceof acb) {
                }
                list.add(new adt(mmaVar, i4, euxVar, null));
            }
        }
    }

    public static int by(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 4) {
            return 4;
        }
        if (i == 8) {
            return 3;
        }
        throw new IllegalArgumentException(cf(i, "Unknown visibility "));
    }

    public static int bz(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return by(view.getVisibility());
    }

    public static /* synthetic */ void c(View view, int[] iArr) {
        if (!(view instanceof TextView)) {
            iArr[0] = view.getLeft();
            iArr[1] = view.getRight();
            return;
        }
        TextView textView = (TextView) view;
        CharSequence text = textView.getText();
        if (text != null && text.length() != 0) {
            iArr[0] = textView.getLeft();
            iArr[1] = textView.getRight();
        } else {
            int left = (textView.getLeft() + textView.getRight()) / 2;
            iArr[0] = left;
            iArr[1] = left;
        }
    }

    public static /* synthetic */ String cA(Object obj, Object obj2, String str, String str2) {
        return str + String.valueOf(obj2) + str2 + String.valueOf(obj);
    }

    public static bol ca(awk awkVar, boolean z, boolean z2, np npVar, bao baoVar) {
        Object obj;
        baoVar.x(-20919530);
        if (z) {
            obj = awkVar.b;
        } else if (!z2 || (obj = awkVar.c) == null) {
            obj = awkVar.a;
        }
        bol bolVar = awkVar.b;
        bol bolVar2 = awkVar.c;
        bol bolVar3 = awkVar.a;
        baoVar.x(-443001260);
        obj.getClass();
        boolean zF = baoVar.F(npVar);
        bas basVar = (bas) baoVar;
        Object objT = basVar.T();
        if (zF || objT == ban.a) {
            objT = new ayh((aeh) obj, npVar);
            basVar.ae(objT);
        }
        ayh ayhVar = (ayh) objT;
        Object objT2 = basVar.T();
        Object obj2 = ban.a;
        int i = 0;
        if (objT2 == obj2) {
            objT2 = vyf.R(-1, 0, 6);
            basVar.ae(objT2);
        }
        yrz yrzVar = (yrz) objT2;
        boolean zH = baoVar.H(yrzVar) | baoVar.F(obj);
        Object objT3 = basVar.T();
        if (zH || objT3 == obj2) {
            objT3 = new aye(yrzVar, obj, i);
            basVar.ae(objT3);
        }
        bbn.g((yjk) objT3, baoVar);
        boolean zH2 = baoVar.H(yrzVar) | baoVar.F(ayhVar);
        Object objT4 = basVar.T();
        if (zH2 || objT4 == obj2) {
            objT4 = new ayg(yrzVar, ayhVar, (yih) null, 0);
            basVar.ae(objT4);
        }
        bbn.e(ayhVar, yrzVar, (yjz) objT4, baoVar);
        clx clxVar = (clx) baoVar.f(ccq.d);
        ayhVar.c = clxVar;
        boolean zF2 = baoVar.F(clxVar) | baoVar.F(ayhVar);
        Object objT5 = basVar.T();
        if (zF2 || objT5 == obj2) {
            objT5 = new ayf(ayhVar);
            basVar.ae(objT5);
        }
        ayf ayfVar = (ayf) objT5;
        basVar.aa();
        basVar.aa();
        return ayfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void cb(defpackage.bkp r28, defpackage.yjz r29, defpackage.yka r30, defpackage.yjz r31, defpackage.yjz r32, boolean r33, defpackage.a r34, defpackage.ays r35, defpackage.yjz r36, defpackage.yy r37, defpackage.bao r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 1097
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a.cb(bkp, yjz, yka, yjz, yjz, boolean, a, ays, yjz, yy, bao, int, int):void");
    }

    public static /* synthetic */ String cd(int i, String str, String str2) {
        return str + i + str2;
    }

    public static /* synthetic */ String ce(int i, int i2, String str, String str2) {
        return str + i2 + str2 + i;
    }

    public static /* synthetic */ String cf(int i, String str) {
        return str + i;
    }

    public static /* synthetic */ String cg(String str, String str2, String str3) {
        return str2 + str + str3;
    }

    public static /* synthetic */ String ch(Object obj, String str, String str2) {
        return str + obj.toString() + str2;
    }

    public static /* synthetic */ String ci(String str, String str2, String str3, String str4, String str5) {
        return str3 + str2 + str4 + str + str5;
    }

    public static /* synthetic */ String cj(Object obj, String str, String str2) {
        return str + obj + str2;
    }

    public static /* synthetic */ String ck(Object obj, Object obj2, String str, String str2) {
        return str + obj2 + str2 + obj;
    }

    public static /* synthetic */ String cl(String str, AttributeSet attributeSet, String str2) {
        return attributeSet.getPositionDescription() + str2 + str;
    }

    public static /* synthetic */ String cm(Object obj, String str) {
        return str + obj;
    }

    public static /* synthetic */ String cn(int i, int i2, String str, String str2, String str3) {
        return str + i2 + str2 + i + str3;
    }

    public static /* synthetic */ String cp(long j, String str, String str2) {
        return str + j + str2;
    }

    public static /* synthetic */ String cq(String str, String str2, String str3) {
        return str2 + str3 + str;
    }

    public static /* synthetic */ String cr(String str, String str2) {
        return str2 + str;
    }

    public static /* synthetic */ String cs(long j, String str) {
        return str + j;
    }

    public static /* synthetic */ String ct(Object obj, String str) {
        return str + String.valueOf(obj);
    }

    public static /* synthetic */ String cv(long j, long j2, String str, String str2) {
        return str + j2 + str2 + j;
    }

    public static /* synthetic */ String cw(Object obj, String str, String str2) {
        return str + String.valueOf(obj) + str2;
    }

    public static /* synthetic */ String cy(int i, String str, String str2, String str3) {
        return str2 + str + str3 + i;
    }

    public static /* synthetic */ String cz(String str, String str2, String str3, String str4) {
        return str3 + str2 + str4 + str;
    }

    public static /* synthetic */ void d(View view, cyh cyhVar) {
        csr csrVarF = cyhVar.f(519);
        int i = csrVarF.c;
        csr csrVarF2 = cyhVar.f(128);
        int i2 = csrVarF2.c;
        int i3 = csrVarF.e;
        int i4 = csrVarF2.e;
        int i5 = csrVarF.b;
        int i6 = csrVarF2.b;
        int i7 = csrVarF.d;
        int i8 = csrVarF2.d;
        view.setPadding(Math.max(i5, i6), Math.max(i, i2), Math.max(i7, i8), Math.max(i3, i4));
    }

    public static /* synthetic */ String e(int i) {
        switch (i) {
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            default:
                return "CENTER_Y";
        }
    }

    public static /* synthetic */ String f(int i) {
        return i != 1 ? i != 2 ? "TONAL_SPOT" : "NEUTRAL" : "MONOCHROME";
    }

    public static /* synthetic */ int g(int i) {
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 6 : 5;
        }
        return 4;
    }

    public static /* synthetic */ void h(ExecutorService executorService) throws InterruptedException {
        if (executorService == ForkJoinPool.commonPool() || executorService.isTerminated()) {
            return;
        }
        executorService.shutdown();
        boolean zAwaitTermination = false;
        boolean z = false;
        while (!zAwaitTermination) {
            try {
                zAwaitTermination = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                }
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ List i(bdy bdyVar) {
        return (List) bdyVar.a();
    }

    public static /* synthetic */ long j(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static /* synthetic */ int k(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ int l(long j, long j2) {
        return Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
    }

    public static /* synthetic */ Boolean p() {
        return false;
    }

    public static /* synthetic */ int q(boolean z) {
        return z ? 1231 : 1237;
    }

    public static /* synthetic */ boolean r(int i, int i2) {
        return i == i2;
    }

    public static /* synthetic */ boolean s(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ boolean t(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean u(AtomicReference atomicReference, Object obj) {
        while (!atomicReference.compareAndSet(obj, null)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean v(AtomicReference atomicReference, Object obj) {
        while (!atomicReference.compareAndSet(null, obj)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ ygi w(yjk yjkVar) {
        yjkVar.a();
        return ygi.a;
    }

    public static /* synthetic */ ygi x(bwj bwjVar, bwi bwiVar) {
        bwi.y(bwiVar, bwjVar, 0, 0);
        return ygi.a;
    }

    public static /* synthetic */ ygi y(bwj bwjVar, bwi bwiVar) {
        bwiVar.r(bwjVar, 0, 0, 0.0f);
        return ygi.a;
    }

    public static /* synthetic */ Object[] z() {
        return new Object[0];
    }

    public a(byte[] bArr) {
    }

    public void bB(bv bvVar) {
    }

    public void bC(cr crVar, bv bvVar, View view) {
    }
}
