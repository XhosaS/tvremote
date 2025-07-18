package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.support.v7.widget.ActivityChooserView;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Pair;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ezd extends ezk implements ekd {
    public static final Ordering a = Ordering.from(new ade(14));
    public final Object b;
    public final Context c;
    public eyv d;
    public eyy e;
    public dyo f;
    private final eze j;
    private Thread k;

    public ezd(Context context, eze ezeVar) {
        this(eyv.ao, ezeVar, context);
    }

    protected static int a(dze dzeVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(dzeVar.N)) {
            return 4;
        }
        String strG = g(str);
        String strG2 = g(dzeVar.N);
        if (strG2 == null || strG == null) {
            return (z && strG2 == null) ? 1 : 0;
        }
        if (strG2.startsWith(strG) || strG.startsWith(strG2)) {
            return 3;
        }
        return edt.au(strG2, "-")[0].equals(edt.au(strG, "-")[0]) ? 2 : 0;
    }

    public static int b(int i, int i2) {
        return (i == 0 || i != i2) ? Integer.bitCount(i & i2) : ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    protected static String g(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean m(eyv eyvVar, int i, dze dzeVar) {
        if (clw.J(i) == 0) {
            return false;
        }
        ebd ebdVar = eyvVar.ad;
        if (ebdVar.g && (clw.J(i) & RecyclerView.ItemAnimator.FLAG_MOVED) == 0) {
            return false;
        }
        if (ebdVar.f) {
            boolean z = (dzeVar.at == 0 && dzeVar.au == 0) ? false : true;
            int iJ = clw.J(i);
            if (z && (iJ & 1024) == 0) {
                return false;
            }
        }
        return true;
    }

    private static void s(exi exiVar, ebf ebfVar, Map map) {
        ebb ebbVar;
        for (int i = 0; i < exiVar.c; i++) {
            ebb ebbVar2 = (ebb) ebfVar.am.get(exiVar.b(i));
            if (ebbVar2 != null && ((ebbVar = (ebb) map.get(Integer.valueOf(ebbVar2.a()))) == null || (ebbVar.d.isEmpty() && !ebbVar2.d.isEmpty()))) {
                map.put(Integer.valueOf(ebbVar2.a()), ebbVar2);
            }
        }
    }

    private final void t(eyv eyvVar) {
        boolean zEquals;
        synchronized (this.b) {
            zEquals = this.d.equals(eyvVar);
            this.d = eyvVar;
        }
        if (zEquals) {
            return;
        }
        if (eyvVar.az && this.c == null) {
            edb.e("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        q();
    }

    private static final Pair u(int i, qza qzaVar, int[][][] iArr, eza ezaVar, Comparator comparator) {
        RandomAccess randomAccessOf;
        qza qzaVar2 = qzaVar;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < qzaVar2.a) {
            if (i == qzaVar2.e(i2)) {
                exi exiVarG = qzaVar2.g(i2);
                for (int i3 = 0; i3 < exiVarG.c; i3++) {
                    eba ebaVarB = exiVarG.b(i3);
                    List listA = ezaVar.a(i2, ebaVarB, iArr[i2][i3]);
                    int i4 = ebaVarB.c;
                    boolean[] zArr = new boolean[i4];
                    int i5 = 0;
                    while (i5 < i4) {
                        int i6 = i5 + 1;
                        ezb ezbVar = (ezb) listA.get(i5);
                        int iB = ezbVar.b();
                        if (!zArr[i5] && iB != 0) {
                            boolean z = true;
                            if (iB == 1) {
                                randomAccessOf = ImmutableList.of(ezbVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(ezbVar);
                                int i7 = i6;
                                while (i7 < i4) {
                                    boolean z2 = z;
                                    ezb ezbVar2 = (ezb) listA.get(i7);
                                    if (ezbVar2.b() == 2 && ezbVar.c(ezbVar2)) {
                                        arrayList2.add(ezbVar2);
                                        zArr[i7] = z2;
                                    }
                                    i7++;
                                    z = z2;
                                }
                                randomAccessOf = arrayList2;
                            }
                            arrayList.add(randomAccessOf);
                        }
                        i5 = i6;
                    }
                }
            }
            i2++;
            qzaVar2 = qzaVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = ((ezb) list.get(i8)).c;
        }
        ezb ezbVar3 = (ezb) list.get(0);
        return Pair.create(new epm(ezbVar3.b, iArr2), Integer.valueOf(ezbVar3.a));
    }

    public final eyu e() {
        return new eyu(c());
    }

    @Override // defpackage.ezk
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final eyv c() {
        eyv eyvVar;
        synchronized (this.b) {
            eyvVar = this.d;
        }
        return eyvVar;
    }

    public final void h() {
        boolean z;
        eyy eyyVar;
        synchronized (this.b) {
            z = false;
            if (this.d.az && Build.VERSION.SDK_INT >= 32 && (eyyVar = this.e) != null && eyyVar.a) {
                z = true;
            }
        }
        if (z) {
            q();
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [android.media.Spatializer$OnSpatializerStateChangedListener, java.lang.Object] */
    @Override // defpackage.ezk
    public final void i() {
        eyy eyyVar;
        ?? r3;
        Object obj;
        synchronized (this.b) {
            Thread thread = this.k;
            if (thread != null) {
                eci.b(thread == Thread.currentThread(), "DefaultTrackSelector is accessed on the wrong thread.");
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (eyyVar = this.e) != null) {
            Object obj2 = eyyVar.b;
            if (obj2 != null && (r3 = eyyVar.d) != 0 && (obj = eyyVar.c) != null) {
                cyp$$ExternalSyntheticApiModelOutline6.m(obj2).removeOnSpatializerStateChangedListener(r3);
                ((Handler) obj).removeCallbacksAndMessages(null);
            }
            this.e = null;
        }
        this.g = null;
        this.h = null;
    }

    @Override // defpackage.ezk
    public final void j(dyo dyoVar) {
        if (this.f.equals(dyoVar)) {
            return;
        }
        this.f = dyoVar;
        h();
    }

    @Override // defpackage.ezk
    public final void k(ebf ebfVar) {
        if (ebfVar instanceof eyv) {
            t((eyv) ebfVar);
        }
        eyu eyuVar = new eyu(c());
        eyuVar.q(ebfVar);
        t(new eyv(eyuVar));
    }

    public final void l(eyu eyuVar) {
        t(new eyv(eyuVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x032d  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [eys] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r2v7, types: [eze] */
    /* JADX WARN: Type inference failed for: r3v33, types: [eys] */
    /* JADX WARN: Type inference failed for: r7v0, types: [epm[]] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // defpackage.ezk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final android.util.Pair o(defpackage.qza r24, int[][][] r25, final int[] r26) {
        /*
            Method dump skipped, instructions count: 918
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ezd.o(qza, int[][][], int[]):android.util.Pair");
    }

    public ezd(ebf ebfVar, eze ezeVar, Context context) {
        this.b = new Object();
        this.c = context != null ? context.getApplicationContext() : null;
        this.j = ezeVar;
        if (ebfVar instanceof eyv) {
            this.d = (eyv) ebfVar;
        } else {
            eyu eyuVar = new eyu(eyv.ao);
            eyuVar.q(ebfVar);
            this.d = new eyv(eyuVar);
        }
        this.f = dyo.a;
        if (this.d.az && context == null) {
            edb.e("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    @Override // defpackage.ezk
    public final ekd d() {
        return this;
    }

    @Override // defpackage.ezk
    public final void n() {
    }
}
