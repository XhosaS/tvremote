package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import j$.util.Optional;
import java.io.IOException;
import java.util.Arrays;
import java.util.EnumSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mxi {
    static final yzq a = yyd.a(EnumSet.of(acwh.SUBSCRIPTION_LAYOUT_ROOT_MAX_WIDTH_DIMENSIONS, acwh.SUBSCRIPTION_LAYOUT_ROOT_MAX_HEIGHT_DIMENSIONS, acwh.SUBSCRIPTION_WINDOW_SAFE_AREA_INSETS, acwh.SUBSCRIPTION_WINDOW_SIZE));
    public static final /* synthetic */ int k = 0;
    public final Context b;
    public final AccessibilityManager c;
    public final mxh d;
    public final mwt e;
    public DisplayMetrics f;
    public ajc g;
    public final mws h;
    public acwt i = mws.a;
    public final boolean j;
    private Handler l;
    private final boolean m;

    public mxi(Context context, mwt mwtVar, mws mwsVar, Optional optional, Optional optional2) {
        this.b = context;
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getApplicationContext().getSystemService("accessibility");
        accessibilityManager.getClass();
        this.c = accessibilityManager;
        this.d = new mxh(accessibilityManager);
        this.f = context.getResources().getDisplayMetrics();
        this.e = mwtVar;
        this.h = mwsVar;
        this.m = ((Boolean) optional.orElse(false)).booleanValue();
        this.j = ((Boolean) optional2.orElse(false)).booleanValue();
    }

    static int a(DisplayMetrics displayMetrics, int i) {
        return (int) ((i / displayMetrics.density) + 0.5f);
    }

    public final agfo b(final oal oalVar, final mwu mwuVar) {
        return agfo.e(new agfq() { // from class: mww
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:109:0x01fc  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
            /* JADX WARN: Removed duplicated region for block: B:69:0x0140  */
            /* JADX WARN: Removed duplicated region for block: B:76:0x015b  */
            /* JADX WARN: Removed duplicated region for block: B:77:0x0162  */
            /* JADX WARN: Removed duplicated region for block: B:79:0x0165  */
            /* JADX WARN: Removed duplicated region for block: B:82:0x0172  */
            /* JADX WARN: Removed duplicated region for block: B:83:0x017b  */
            /* JADX WARN: Removed duplicated region for block: B:91:0x01b8  */
            /* JADX WARN: Type inference failed for: r0v29, types: [ahgr] */
            /* JADX WARN: Type inference failed for: r2v42, types: [mxc] */
            @Override // defpackage.agfq
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void a(defpackage.agfp r19) throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 548
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mww.a(agfp):void");
            }
        }).g(new aggw() { // from class: mwx
            @Override // defpackage.aggw
            public final boolean a(Object obj, Object obj2) {
                return Arrays.equals((byte[]) obj, (byte[]) obj2);
            }
        });
    }

    public final void c(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
            return;
        }
        if (this.l == null) {
            this.l = new Handler(Looper.getMainLooper());
        }
        this.l.post(runnable);
    }

    public final byte[] d(View view, int i, int i2, boolean z) {
        int iA;
        int iA2;
        int iA3;
        if (view != null) {
            iA = a(this.f, view.getWidth());
            iA2 = a(this.f, view.getHeight());
        } else {
            iA = i;
            iA2 = i2;
        }
        if (view != null && this.m) {
            this.f = view.getContext().getResources().getDisplayMetrics();
        }
        DisplayMetrics displayMetrics = this.f;
        int iA4 = a(displayMetrics, displayMetrics.widthPixels);
        DisplayMetrics displayMetrics2 = this.f;
        int iA5 = a(displayMetrics2, displayMetrics2.heightPixels);
        int i3 = (iA4 == 0 || iA5 == 0) ? 1 : iA5 > iA4 ? 4 : 2;
        acwj acwjVar = acwj.a;
        acwi acwiVar = new acwi();
        if ((acwiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acwiVar.y();
        }
        acwj acwjVar2 = (acwj) acwiVar.b;
        acwjVar2.g = 0;
        acwjVar2.b |= 16;
        float f = iA;
        if ((acwiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acwiVar.y();
        }
        acwj acwjVar3 = (acwj) acwiVar.b;
        acwjVar3.b |= 1;
        acwjVar3.c = f;
        float f2 = iA2;
        if ((acwiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acwiVar.y();
        }
        acwj acwjVar4 = (acwj) acwiVar.b;
        acwjVar4.b |= 2;
        acwjVar4.d = f2;
        acvf acvfVar = acvf.a;
        acve acveVar = new acve();
        if ((acveVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acveVar.y();
        }
        acvf acvfVar2 = (acvf) acveVar.b;
        acvfVar2.c = i3 - 1;
        acvfVar2.b |= 1;
        acvf acvfVar3 = (acvf) acveVar.v();
        if ((acwiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acwiVar.y();
        }
        acwj acwjVar5 = (acwj) acwiVar.b;
        acvfVar3.getClass();
        acwjVar5.e = acvfVar3;
        acwjVar5.b |= 4;
        acys acysVar = acys.a;
        acyr acyrVar = new acyr();
        float f3 = iA4;
        if ((acyrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acyrVar.y();
        }
        acys acysVar2 = (acys) acyrVar.b;
        acysVar2.b |= 1;
        acysVar2.c = f3;
        float f4 = iA5;
        if ((acyrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acyrVar.y();
        }
        acys acysVar3 = (acys) acyrVar.b;
        acysVar3.b |= 2;
        acysVar3.d = f4;
        acys acysVar4 = (acys) acyrVar.v();
        if ((acwiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acwiVar.y();
        }
        acwj acwjVar6 = (acwj) acwiVar.b;
        acysVar4.getClass();
        acwjVar6.f = acysVar4;
        acwjVar6.b |= 8;
        int i4 = this.b.getApplicationContext().getResources().getConfiguration().smallestScreenWidthDp < 600 ? 1 : 2;
        if ((acwiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acwiVar.y();
        }
        acwj acwjVar7 = (acwj) acwiVar.b;
        acwjVar7.h = i4 - 1;
        acwjVar7.b |= 32;
        ajc ajcVar = this.g;
        DisplayMetrics displayMetrics3 = this.f;
        aiy aiyVar = ajcVar.b;
        acs acsVarA = aiyVar.a(519);
        acs acsVarA2 = aiyVar.a(128);
        acvi acviVar = acvi.a;
        acvh acvhVar = new acvh();
        acvk acvkVar = acvk.a;
        acvj acvjVar = new acvj();
        float fA = a(displayMetrics3, Math.max(acsVarA.c, acsVarA2.c));
        if ((acvjVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acvjVar.y();
        }
        acvk acvkVar2 = (acvk) acvjVar.b;
        acvkVar2.b |= 1;
        acvkVar2.c = fA;
        acvk acvkVar3 = (acvk) acvjVar.v();
        if ((acvhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acvhVar.y();
        }
        acvi acviVar2 = (acvi) acvhVar.b;
        acvkVar3.getClass();
        acviVar2.c = acvkVar3;
        acviVar2.b |= 1;
        acvj acvjVar2 = new acvj();
        float fA2 = a(displayMetrics3, Math.max(acsVarA.e, acsVarA2.e));
        if ((acvjVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acvjVar2.y();
        }
        acvk acvkVar4 = (acvk) acvjVar2.b;
        acvkVar4.b |= 1;
        acvkVar4.c = fA2;
        acvk acvkVar5 = (acvk) acvjVar2.v();
        if ((acvhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acvhVar.y();
        }
        acvi acviVar3 = (acvi) acvhVar.b;
        acvkVar5.getClass();
        acviVar3.e = acvkVar5;
        acviVar3.b = 4 | acviVar3.b;
        acvj acvjVar3 = new acvj();
        float fA3 = a(displayMetrics3, Math.max(acsVarA.b, acsVarA2.b));
        if ((acvjVar3.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acvjVar3.y();
        }
        acvk acvkVar6 = (acvk) acvjVar3.b;
        acvkVar6.b |= 1;
        acvkVar6.c = fA3;
        acvk acvkVar7 = (acvk) acvjVar3.v();
        if ((acvhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acvhVar.y();
        }
        acvi acviVar4 = (acvi) acvhVar.b;
        acvkVar7.getClass();
        acviVar4.d = acvkVar7;
        acviVar4.b |= 2;
        acvj acvjVar4 = new acvj();
        float fA4 = a(displayMetrics3, Math.max(acsVarA.d, acsVarA2.d));
        if ((acvjVar4.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acvjVar4.y();
        }
        acvk acvkVar8 = (acvk) acvjVar4.b;
        acvkVar8.b |= 1;
        acvkVar8.c = fA4;
        acvk acvkVar9 = (acvk) acvjVar4.v();
        if ((acvhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acvhVar.y();
        }
        acvi acviVar5 = (acvi) acvhVar.b;
        acvkVar9.getClass();
        acviVar5.f = acvkVar9;
        acviVar5.b |= 8;
        acvi acviVar6 = (acvi) acvhVar.v();
        if ((acwiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acwiVar.y();
        }
        acwj acwjVar8 = (acwj) acwiVar.b;
        acviVar6.getClass();
        acwjVar8.j = acviVar6;
        acwjVar8.b |= 128;
        acwt acwtVar = this.i;
        if ((acwiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acwiVar.y();
        }
        acwj acwjVar9 = (acwj) acwiVar.b;
        acwtVar.getClass();
        acwjVar9.l = acwtVar;
        acwjVar9.b |= 512;
        Boolean boolA = this.d.a();
        if (boolA != null) {
            boolean zBooleanValue = boolA.booleanValue();
            if ((acwiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acwiVar.y();
            }
            acwj acwjVar10 = (acwj) acwiVar.b;
            acwjVar10.b |= 64;
            acwjVar10.i = zBooleanValue;
        }
        if ((acwiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acwiVar.y();
        }
        acwj acwjVar11 = (acwj) acwiVar.b;
        acwjVar11.b |= 256;
        acwjVar11.k = z;
        acwj acwjVar12 = (acwj) acwiVar.v();
        try {
            int i5 = acwjVar12.memoizedSerializedSize;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                iA3 = abza.a.a(acwjVar12.getClass()).a(acwjVar12);
                if (iA3 < 0) {
                    throw new IllegalStateException(a.b(iA3, "serialized size must be non-negative, was "));
                }
            } else {
                iA3 = i5 & Integer.MAX_VALUE;
                if (iA3 == Integer.MAX_VALUE) {
                    iA3 = abza.a.a(acwjVar12.getClass()).a(acwjVar12);
                    if (iA3 < 0) {
                        throw new IllegalStateException(a.b(iA3, "serialized size must be non-negative, was "));
                    }
                    acwjVar12.memoizedSerializedSize = (acwjVar12.memoizedSerializedSize & Integer.MIN_VALUE) | iA3;
                }
            }
            byte[] bArr = new byte[iA3];
            boolean z2 = abvz.e;
            abvw abvwVar = new abvw(bArr, 0, iA3);
            abza.a.a(acwjVar12.getClass()).m(acwjVar12, abwa.a(abvwVar));
            abvwVar.K();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(a.u(acwjVar12, " to a byte array threw an IOException (should never happen)."), e);
        }
    }
}
