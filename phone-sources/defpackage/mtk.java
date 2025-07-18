package defpackage;

import android.content.res.Resources;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.apps.play.movies.common.view.tagging.TagsView;
import com.google.android.videos.R;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mtk extends lkx implements loc, idy {
    public final List a = new ArrayList();
    public final mgf b;
    public lwh c;
    public lwh d;
    public int e;
    public int f;
    public kuw g;
    private final ieh h;
    private final float i;
    private final mgf j;
    private final lwl k;
    private final lfn l;
    private lwx m;

    public mtk(ieh iehVar, float f, mgf mgfVar, mgf mgfVar2, lwl lwlVar, lfn lfnVar) {
        this.h = iehVar;
        this.l = lfnVar;
        this.i = f;
        this.j = mgfVar;
        this.b = mgfVar2;
        this.k = lwlVar;
    }

    private final void e() {
        mgf mgfVar = this.j;
        if (mgfVar != null) {
            ((mtd) mgfVar).e();
        }
        mgf mgfVar2 = this.b;
        if (mgfVar2 != null) {
            ((msz) mgfVar2).e();
        }
        this.a.clear();
        this.e = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fd A[SYNTHETIC] */
    @Override // defpackage.idy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.ieg r20) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mtk.c(ieg):void");
    }

    public final void b() {
        mgf mgfVar = this.j;
        if (mgfVar != null) {
            mtd mtdVar = (mtd) mgfVar;
            mtdVar.f();
            mtdVar.a.a();
            mtdVar.l = null;
        }
        mgf mgfVar2 = this.b;
        if (mgfVar2 != null) {
            msz mszVar = (msz) mgfVar2;
            mszVar.f();
            mth mthVar = mszVar.c;
            mthVar.a();
            mthVar.b.clear();
            mthVar.c = null;
            mthVar.d = null;
            mthVar.e = 0;
            mthVar.g = -1L;
            mthVar.h = -1L;
        }
        this.m = null;
        this.c = null;
        this.g = null;
        this.d = null;
    }

    public final void d() {
        lws lwsVar;
        int iB;
        meq meqVar = (meq) this.h.a();
        mgf mgfVar = this.j;
        boolean z = mgfVar != null && meqVar.a > 0 && meqVar.b > 0;
        List list = this.a;
        list.clear();
        if (this.g != null) {
            ArrayList arrayList = new ArrayList();
            int iA = this.m.a(1);
            kuw kuwVar = this.g;
            int i = this.e;
            int iBinarySearch = Arrays.binarySearch((int[]) kuwVar.b, i);
            if (iBinarySearch >= 0 || (~iBinarySearch) - 1 >= 0) {
                lwn[] lwnVarArr = ((lwn[][]) kuwVar.a)[iBinarySearch];
                for (lwn lwnVar : lwnVarArr) {
                    lwn lwnVarC = lwnVar.c(i);
                    if (lwnVarC != null && (lwnVarC.d || lwnVarC.b + iA <= i)) {
                        arrayList.add(lwnVarC);
                    }
                }
            }
            int i2 = z ? meqVar.a : 1920;
            int i3 = z ? meqVar.b : 800;
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                lwn lwnVar2 = (lwn) arrayList.get(i4);
                lwo lwoVarA = lwnVar2.a(this.e, i2, i3, this.i);
                lwx lwxVar = this.m;
                int i5 = lwnVar2.a;
                list.add(new lwu(lwxVar.b(i5), i5, lwoVarA));
            }
            Collections.sort(list, lwg.a);
        }
        if (mgfVar != null) {
            final int i6 = this.e;
            int i7 = meqVar.a;
            int i8 = meqVar.b;
            int i9 = this.f;
            mtd mtdVar = (mtd) mgfVar;
            List list2 = mtdVar.b;
            list2.clear();
            list2.addAll(list);
            if (i7 <= 0 || i8 <= 0 || list.isEmpty()) {
                mtdVar.a.a();
            } else {
                TagsView tagsView = mtdVar.a;
                tagsView.c = krh.h(list);
                tagsView.a = i7;
                tagsView.b = i8;
                tagsView.b();
            }
            ImmutableList.Builder builder = new ImmutableList.Builder();
            FluentIterable fluentIterableTransform = FluentIterable.from(list).transform(new lsq(15));
            builder.addAll((Iterable) fluentIterableTransform);
            ImmutableSet set = fluentIterableTransform.transform(new lsq(16)).toSet();
            lwx lwxVar2 = mtdVar.l;
            int i10 = 5;
            if (lwxVar2.g) {
                List list3 = lwxVar2.b;
                TreeMap treeMap = new TreeMap(bxy.h);
                for (int i11 = 0; i11 < list3.size(); i11++) {
                    lwq lwqVar = (lwq) list3.get(i11);
                    if ((lwqVar instanceof lws) && !set.contains(Integer.valueOf(lwqVar.a)) && i6 - i9 <= (iB = (lwsVar = (lws) lwqVar).b(i6)) && iB < i6) {
                        treeMap.put(Pair.create(lwsVar, Integer.valueOf(iB)), lwsVar);
                        if (treeMap.size() > 5) {
                            treeMap.pollLastEntry();
                        }
                    }
                }
                builder.addAll((Iterable) treeMap.values());
            }
            ImmutableList immutableListBuild = builder.build();
            ntp ntpVar = new ntp((byte[]) null);
            final Resources resources = mtdVar.getResources();
            final san sanVar = mtdVar.h;
            final rzy rzyVar = mtdVar.i;
            ntpVar.x(new zuw(R.layout.info_card_row, new lnt(FluentIterable.from(immutableListBuild).transform(new tsl() { // from class: nbf
                /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, lhf] */
                /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, nbj] */
                @Override // defpackage.tsl
                public final Object apply(Object obj) {
                    Object obj2;
                    Object obj3;
                    ?? r7;
                    ?? r8;
                    lwq lwqVar2 = (lwq) obj;
                    boolean z2 = lwqVar2 instanceof lws;
                    san sanVar2 = sanVar;
                    rzy rzyVar2 = rzyVar;
                    int i12 = 2;
                    if (!z2) {
                        lwt lwtVar = (lwt) lwqVar2;
                        tst tstVarI = trk.a;
                        String str = lwtVar.c;
                        if (str == null) {
                            throw new NullPointerException("Null title");
                        }
                        String str2 = lwtVar.f;
                        if (str2 == null) {
                            throw new NullPointerException("Null performer");
                        }
                        nbm nbmVar = nbm.a;
                        tju tjuVar = lwtVar.e;
                        if (tjuVar != null) {
                            tstVarI = tst.i(tjuVar.g);
                        }
                        tst tstVar = tstVarI;
                        saf safVar = (saf) sanVar2.h(rzyVar2).a(wgi.SONG_INFO_CARD);
                        vtw vtwVarM = wge.a.m();
                        if (!vtwVarM.b.A()) {
                            vtwVarM.u();
                        }
                        vuc vucVar = vtwVarM.b;
                        wge wgeVar = (wge) vucVar;
                        wgeVar.e = 2;
                        wgeVar.b |= 4;
                        if (!vucVar.A()) {
                            vtwVarM.u();
                        }
                        wge wgeVar2 = (wge) vtwVarM.b;
                        wgeVar2.d = 4;
                        wgeVar2.b = 2 | wgeVar2.b;
                        String strD = lwtVar.d();
                        if (!vtwVarM.b.A()) {
                            vtwVarM.u();
                        }
                        wge wgeVar3 = (wge) vtwVarM.b;
                        strD.getClass();
                        wgeVar3.b = 1 | wgeVar3.b;
                        wgeVar3.c = strD;
                        safVar.a = (wge) vtwVarM.r();
                        return new nbn(str, str2, tstVar, new nbl(lwtVar.g, (rzy) safVar.e()), nbmVar);
                    }
                    lws lwsVar2 = (lws) lwqVar2;
                    nbh nbhVar = new nbh(null);
                    nbhVar.b = trk.a;
                    nbhVar.a(false);
                    String str3 = lwsVar2.c;
                    if (str3 == null) {
                        throw new NullPointerException("Null name");
                    }
                    Resources resources2 = resources;
                    nbhVar.d = str3;
                    nbhVar.g = nbm.b;
                    String strF = jwq.F(resources2, false, FluentIterable.from(lwsVar2.f).transform(new nbe(resources2, i12)).toList());
                    if (true == TextUtils.isEmpty(strF)) {
                        strF = "";
                    }
                    if (strF == null) {
                        throw new NullPointerException("Null roles");
                    }
                    nbhVar.e = strF;
                    tju tjuVar2 = lwsVar2.e;
                    if (tjuVar2 != null) {
                        nbhVar.b = tst.i(tjuVar2.g);
                    }
                    nbhVar.a(!lwsVar2.c(i6));
                    nbhVar.f = new nbg(lwsVar2, (rzy) ((sah) sanVar2.g(rzyVar2).a(wgi.ACTOR_INFO_CARD)).e());
                    if (nbhVar.c == 1 && (obj2 = nbhVar.d) != null && (obj3 = nbhVar.e) != null && (r7 = nbhVar.f) != 0 && (r8 = nbhVar.g) != 0) {
                        return new nbi(nbhVar.a, (String) obj2, (String) obj3, nbhVar.b, r7, r8);
                    }
                    StringBuilder sb = new StringBuilder();
                    if (nbhVar.c == 0) {
                        sb.append(" justMissed");
                    }
                    if (nbhVar.d == null) {
                        sb.append(" name");
                    }
                    if (nbhVar.e == null) {
                        sb.append(" roles");
                    }
                    if (nbhVar.f == null) {
                        sb.append(" clickEvent");
                    }
                    if (nbhVar.g == null) {
                        sb.append(" infoCardImageLoader");
                    }
                    throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                }
            }).toList(), 11), null));
            ifb ifbVarB = ntpVar.b();
            RecyclerView recyclerView = mtdVar.f;
            recyclerView.setVisibility(0);
            recyclerView.setAdapter(ifbVarB);
            recyclerView.setLayoutManager(new LinearLayoutManager(mtdVar.getContext(), 0, false));
            new ksa(ifbVarB, 0).a();
            mtdVar.getContext();
            kff.p(recyclerView, nbg.class, new mmn(sanVar, mgfVar, i10));
            if (immutableListBuild.isEmpty()) {
                mtdVar.e();
            } else {
                mtdVar.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0042  */
    @Override // defpackage.lkx, defpackage.lkr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void maybeShowKnowledge(int r6, int r7) {
        /*
            r5 = this;
            r0 = 0
            r1 = -1
            if (r7 != r1) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = r0
        L7:
            if (r2 != 0) goto Lb
            if (r7 <= r6) goto Lc
        Lb:
            r7 = r6
        Lc:
            if (r2 == 0) goto L10
            r7 = r0
            goto L1c
        L10:
            int r7 = r6 - r7
            lfn r2 = r5.l
            int r2 = r2.S()
            int r7 = java.lang.Math.min(r7, r2)
        L1c:
            lwx r2 = r5.m
            if (r2 == 0) goto L7c
            mgf r3 = r5.j
            if (r3 != 0) goto L28
            mgf r4 = r5.b
            if (r4 == 0) goto L7c
        L28:
            r5.e = r6
            r5.f = r7
            if (r3 == 0) goto L75
            lwh r7 = r5.c
            r3 = 0
            if (r7 == 0) goto L3e
            int r4 = r7.a
            if (r4 > r6) goto L3e
            int r7 = r7.b
            if (r6 >= r7) goto L3e
            r5.d = r3
            goto L61
        L3e:
            boolean r7 = r2.g
            if (r7 != 0) goto L44
        L42:
            r6 = r3
            goto L59
        L44:
            int[] r7 = r2.f
            int r6 = java.util.Arrays.binarySearch(r7, r6)
            if (r6 >= 0) goto L4e
            int r6 = ~r6
            int r6 = r6 + r1
        L4e:
            if (r6 >= 0) goto L51
            goto L42
        L51:
            java.util.List r7 = r2.e
            java.lang.Object r6 = r7.get(r6)
            lwh r6 = (defpackage.lwh) r6
        L59:
            if (r6 != 0) goto L65
            r5.c = r3
            r5.g = r3
            r5.d = r3
        L61:
            r5.d()
            goto L75
        L65:
            lwh r7 = r5.d
            if (r6 == r7) goto L75
            r5.d = r6
            mtj r7 = new mtj
            r7.<init>(r5, r2, r6)
            java.lang.Void[] r6 = new java.lang.Void[r0]
            r7.execute(r6)
        L75:
            mgf r6 = r5.b
            if (r6 == 0) goto L7c
            r6.c()
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mtk.maybeShowKnowledge(int, int):void");
    }

    @Override // defpackage.lkx, defpackage.lkr
    public final void onPlayerStateChanged(int i, llt lltVar, int i2) {
        if (i != 0 && i != 1) {
            if (i == 2) {
                mgf mgfVar = this.j;
                if (mgfVar != null) {
                    ((mtd) mgfVar).e();
                }
                mgf mgfVar2 = this.b;
                if (mgfVar2 != null) {
                    msz mszVar = (msz) mgfVar2;
                    if (mszVar.m == 2) {
                        mszVar.c.b();
                    }
                }
                this.a.clear();
                this.e = -1;
                return;
            }
            if (i != 4) {
                return;
            }
        }
        e();
    }

    @Override // defpackage.loc
    public final void s(int i) {
        e();
    }

    @Override // defpackage.loc
    public final void r() {
    }

    @Override // defpackage.loc
    public final void t(int i, int i2, boolean z) {
    }
}
