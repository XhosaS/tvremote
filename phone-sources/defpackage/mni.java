package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.videos.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mni implements lhg {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ mni(List list, List list2, ovs ovsVar, List list3, List list4, isi isiVar, int i) {
        this.g = i;
        this.c = list;
        this.e = list2;
        this.b = ovsVar;
        this.f = list3;
        this.d = list4;
        this.a = isiVar;
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, lie] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, lie] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, ovs] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, mcd] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, mcd] */
    @Override // defpackage.lhg
    public final void a(lhf lhfVar) throws Resources.NotFoundException {
        int i = this.g;
        int i2 = 0;
        if (i == 0) {
            nal nalVar = (nal) lhfVar;
            lio lioVar = nalVar.e;
            nqq.d(lioVar);
            final lio lioVar2 = ((lif) lioVar).a;
            boolean z = nalVar.c;
            Object obj = this.f;
            Object obj2 = this.a;
            if (z) {
                ((oxe) obj).e(((Resources) obj2).getString(R.string.user_feedback_option_not_available_toast), lioVar2);
                return;
            }
            ldy ldyVar = (ldy) this.b;
            if (ldyVar.a().m()) {
                final ?? r8 = this.e;
                Object obj3 = this.d;
                final ?? r14 = this.c;
                kxe kxeVar = nalVar.b;
                final ksy ksyVar = kxeVar.a;
                final int i3 = kxeVar.d;
                boolean z2 = i3 != 2;
                final String str = (String) obj3;
                r14.ay(ksyVar, 2, z2, str);
                ksn ksnVar = (ksn) ldyVar.a().g();
                final String str2 = nalVar.a;
                r8.d(ksnVar, ksyVar, 2, z2, str2);
                if (z2) {
                    String string = ((Resources) obj2).getString(R.string.user_feedback_thumbdown_toast);
                    final ksn ksnVar2 = (ksn) ldyVar.a().g();
                    final View view = nalVar.d;
                    final int i4 = 2;
                    mnu.h((oxe) obj, string, new View.OnClickListener() { // from class: mnh
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            boolean z3;
                            int i5 = i3;
                            int i6 = i4;
                            if (i5 == 3) {
                                z3 = false;
                            } else {
                                z3 = true;
                                i6 = i6 == 1 ? 2 : 1;
                            }
                            boolean z4 = z3;
                            int i7 = i6;
                            View view3 = view;
                            lio lioVar3 = lioVar2;
                            String str3 = str2;
                            ksn ksnVar3 = ksnVar2;
                            mcd mcdVar = r8;
                            String str4 = str;
                            ksy ksyVar2 = ksyVar;
                            r14.ay(ksyVar2, i7, z4, str4);
                            mcdVar.d(ksnVar3, ksyVar2, i7, z4, str3);
                            nqq.j(519, lioVar3);
                            jwq.W(view3);
                        }
                    }, view, lioVar2);
                    return;
                }
                return;
            }
            return;
        }
        if (i != 1) {
            nam namVar = (nam) lhfVar;
            lio lioVar3 = namVar.e;
            nqq.d(lioVar3);
            final lio lioVar4 = ((lif) lioVar3).a;
            boolean z3 = namVar.c;
            Object obj4 = this.f;
            Object obj5 = this.a;
            if (z3) {
                ((oxe) obj4).e(((Resources) obj5).getString(R.string.user_feedback_option_not_available_toast), lioVar4);
                return;
            }
            ldy ldyVar2 = (ldy) this.b;
            if (ldyVar2.a().m()) {
                final ?? r82 = this.e;
                Object obj6 = this.d;
                final ?? r142 = this.c;
                kxe kxeVar2 = namVar.b;
                final ksy ksyVar2 = kxeVar2.a;
                final int i5 = kxeVar2.d;
                boolean z4 = i5 != 1;
                final String str3 = (String) obj6;
                r142.ay(ksyVar2, 1, z4, str3);
                ksn ksnVar3 = (ksn) ldyVar2.a().g();
                final String str4 = namVar.a;
                r82.d(ksnVar3, ksyVar2, 1, z4, str4);
                if (z4) {
                    String string2 = ((Resources) obj5).getString(R.string.user_feedback_thumbup_toast);
                    final ksn ksnVar4 = (ksn) ldyVar2.a().g();
                    final View view2 = namVar.d;
                    final int i6 = 1;
                    mnu.h((oxe) obj4, string2, new View.OnClickListener() { // from class: mnh
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view22) {
                            boolean z32;
                            int i52 = i5;
                            int i62 = i6;
                            if (i52 == 3) {
                                z32 = false;
                            } else {
                                z32 = true;
                                i62 = i62 == 1 ? 2 : 1;
                            }
                            boolean z42 = z32;
                            int i7 = i62;
                            View view3 = view2;
                            lio lioVar32 = lioVar4;
                            String str32 = str4;
                            ksn ksnVar32 = ksnVar4;
                            mcd mcdVar = r82;
                            String str42 = str3;
                            ksy ksyVar22 = ksyVar2;
                            r142.ay(ksyVar22, i7, z42, str42);
                            mcdVar.d(ksnVar32, ksyVar22, i7, z42, str32);
                            nqq.j(519, lioVar32);
                            jwq.W(view3);
                        }
                    }, view2, lioVar4);
                    return;
                }
                return;
            }
            return;
        }
        ylf ylfVar = new ylf();
        ieg iegVar = ieg.a;
        iegVar.getClass();
        ylfVar.a = iegVar;
        ylf ylfVar2 = new ylf();
        iegVar.getClass();
        ylfVar2.a = iegVar;
        Map map = ((mvn) lhfVar).a;
        boolean zContainsKey = map.containsKey("caption_options");
        ?? r7 = this.b;
        if (zContainsKey) {
            ?? r6 = this.c;
            String str5 = (String) map.get("caption_options");
            Iterator it = r6.iterator();
            int i7 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i7 = -1;
                    break;
                } else if (yks.e(str5, jbr.p((kwx) it.next()))) {
                    break;
                } else {
                    i7++;
                }
            }
            if (i7 != -1) {
                ouk oukVar = (ouk) this.e.get(i7);
                ylfVar.a = ieg.f(oukVar);
                r7.T(oukVar);
            }
        }
        if (map.containsKey("audio_options")) {
            ?? r62 = this.f;
            String str6 = (String) map.get("audio_options");
            Iterator it2 = r62.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    i2 = -1;
                    break;
                } else if (yks.e(str6, jbr.o((kzo) it2.next()))) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != -1) {
                ouj oujVar = (ouj) this.d.get(i2);
                ylfVar2.a = ieg.f(oujVar);
                r7.S(oujVar);
            }
        }
        if (((ieg) ylfVar.a).m() || ((ieg) ylfVar2.a).m()) {
            ((isi) this.a).e(new iky(ylfVar, ylfVar2, 15)).r(new iwg(13));
        }
    }

    public /* synthetic */ mni(oxe oxeVar, Resources resources, iea ieaVar, lie lieVar, String str, mcd mcdVar, int i) {
        this.g = i;
        this.f = oxeVar;
        this.a = resources;
        this.b = ieaVar;
        this.c = lieVar;
        this.d = str;
        this.e = mcdVar;
    }
}
