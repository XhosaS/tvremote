package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dp {
    public final ViewGroup a;
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    public boolean d;
    public boolean e;
    private boolean f;

    public dp(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public static final dp c(ViewGroup viewGroup, cr crVar) {
        viewGroup.getClass();
        d dVarAl = crVar.al();
        dVarAl.getClass();
        return a.bD(viewGroup, dVarAl);
    }

    private final void k() {
        for (C0038do c0038do : this.b) {
            if (c0038do.i == 2) {
                c0038do.h(a.by(c0038do.a.requireView().getVisibility()), 1);
            }
        }
    }

    private final void l(Map map, View view) {
        int[] iArr = cww.a;
        String strF = cwm.f(view);
        if (strF != null) {
            map.put(strF, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    childAt.getClass();
                    l(map, childAt);
                }
            }
        }
    }

    private static void m(ir irVar, Collection collection) {
        yfm.M(irVar.entrySet(), new kb(collection, 1));
    }

    public final C0038do a(bv bvVar) {
        Object next;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C0038do c0038do = (C0038do) next;
            if (yks.e(c0038do.a, bvVar) && !c0038do.b) {
                break;
            }
        }
        return (C0038do) next;
    }

    public final C0038do b(bv bvVar) {
        Object next;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C0038do c0038do = (C0038do) next;
            if (yks.e(c0038do.a, bvVar) && !c0038do.b) {
                break;
            }
        }
        return (C0038do) next;
    }

    public final void d(C0038do c0038do) {
        c0038do.getClass();
        if (c0038do.f) {
            int i = c0038do.h;
            bv bvVar = c0038do.a;
            fh.e(i, bvVar.requireView(), this.a);
            c0038do.g();
        }
    }

    public final void e(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yfm.I(arrayList, ((C0038do) it.next()).g);
        }
        List listAl = yfm.al(yfm.aq(arrayList));
        int size = listAl.size();
        for (int i = 0; i < size; i++) {
            ((dm) listAl.get(i)).b(this.a);
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            d((C0038do) list.get(i2));
        }
        List listAl2 = yfm.al(list);
        int size3 = listAl2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            C0038do c0038do = (C0038do) listAl2.get(i3);
            if (c0038do.g.isEmpty()) {
                c0038do.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x040f A[Catch: all -> 0x056b, LOOP:25: B:165:0x0409->B:167:0x040f, LOOP_END, TryCatch #0 {, blocks: (B:11:0x0019, B:12:0x0026, B:14:0x002d, B:16:0x0039, B:20:0x0041, B:21:0x0044, B:22:0x0048, B:24:0x004f, B:26:0x0059, B:28:0x005f, B:29:0x0062, B:34:0x0072, B:36:0x0078, B:30:0x0066, B:32:0x006c, B:33:0x006f, B:37:0x007c, B:39:0x0082, B:41:0x008f, B:42:0x009b, B:44:0x00a1, B:46:0x00b5, B:50:0x00bb, B:51:0x00c6, B:53:0x00cc, B:55:0x00e0, B:59:0x00e6, B:61:0x00ef, B:62:0x00f5, B:63:0x010b, B:65:0x0111, B:66:0x0134, B:67:0x013c, B:69:0x0142, B:76:0x015c, B:77:0x016b, B:78:0x0174, B:80:0x017a, B:82:0x0187, B:83:0x018b, B:84:0x0194, B:86:0x019a, B:88:0x01a7, B:89:0x01ab, B:90:0x01b1, B:92:0x01b7, B:96:0x01c6, B:97:0x01ef, B:168:0x041b, B:169:0x0429, B:171:0x042f, B:172:0x043d, B:173:0x0446, B:175:0x044c, B:177:0x0461, B:179:0x0465, B:180:0x0469, B:182:0x0473, B:184:0x0479, B:185:0x047d, B:187:0x0482, B:188:0x0485, B:189:0x048f, B:190:0x0493, B:192:0x0499, B:194:0x04a5, B:196:0x04ab, B:198:0x04b1, B:200:0x04b7, B:201:0x04bb, B:202:0x04c4, B:204:0x04c9, B:206:0x04cf, B:208:0x04dd, B:211:0x04e4, B:212:0x04e8, B:214:0x04ee, B:218:0x04fe, B:219:0x0507, B:221:0x050d, B:222:0x0519, B:226:0x0522, B:227:0x0527, B:229:0x052d, B:234:0x0540, B:236:0x0544, B:241:0x0563, B:238:0x054d, B:240:0x0557, B:101:0x01fa, B:102:0x0227, B:104:0x022d, B:108:0x023f, B:110:0x0275, B:112:0x0282, B:113:0x0289, B:114:0x028e, B:116:0x0297, B:118:0x02b2, B:120:0x02c1, B:121:0x02e5, B:123:0x02ef, B:124:0x02f6, B:126:0x02fc, B:127:0x0303, B:128:0x030a, B:130:0x0310, B:131:0x0317, B:133:0x0324, B:135:0x032a, B:136:0x032d, B:137:0x032e, B:139:0x0349, B:141:0x034f, B:142:0x0352, B:143:0x0353, B:145:0x035d, B:147:0x0369, B:148:0x036c, B:149:0x036f, B:151:0x0383, B:117:0x02a5, B:157:0x03d2, B:159:0x03d8, B:160:0x03dc, B:162:0x03e2, B:164:0x03ec, B:165:0x0409, B:167:0x040f), top: B:250:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0521  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 1390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dp.f():void");
    }

    public final void g() {
        ViewGroup viewGroup = this.a;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        List list = this.b;
        synchronized (list) {
            k();
            i(list);
            List<C0038do> listAn = yfm.an(this.c);
            Iterator it = listAn.iterator();
            while (it.hasNext()) {
                ((C0038do) it.next()).d = false;
            }
            for (C0038do c0038do : listAn) {
                if (cr.Y(2)) {
                    if (!zIsAttachedToWindow) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Container ");
                        sb.append(viewGroup);
                        sb.append(" is not attached to window. ");
                    }
                    Objects.toString(c0038do);
                }
                c0038do.e(viewGroup);
            }
            List<C0038do> listAn2 = yfm.an(list);
            Iterator it2 = listAn2.iterator();
            while (it2.hasNext()) {
                ((C0038do) it2.next()).d = false;
            }
            for (C0038do c0038do2 : listAn2) {
                if (cr.Y(2)) {
                    if (!zIsAttachedToWindow) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Container ");
                        sb2.append(viewGroup);
                        sb2.append(" is not attached to window. ");
                    }
                    Objects.toString(c0038do2);
                }
                c0038do2.e(viewGroup);
            }
        }
    }

    public final void h() {
        Object objPrevious;
        List list = this.b;
        synchronized (list) {
            k();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                C0038do c0038do = (C0038do) objPrevious;
                View view = c0038do.a.mView;
                view.getClass();
                int iBz = a.bz(view);
                if (c0038do.h == 2 && iBz != 2) {
                    break;
                }
            }
            C0038do c0038do2 = (C0038do) objPrevious;
            bv bvVar = c0038do2 != null ? c0038do2.a : null;
            this.e = bvVar != null ? bvVar.isPostponed() : false;
        }
    }

    public final void i(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C0038do) list.get(i)).b();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yfm.I(arrayList, ((C0038do) it.next()).g);
        }
        List listAl = yfm.al(yfm.aq(arrayList));
        int size2 = listAl.size();
        for (int i2 = 0; i2 < size2; i2++) {
            dm dmVar = (dm) listAl.get(i2);
            ViewGroup viewGroup = this.a;
            if (!dmVar.i) {
                dmVar.c(viewGroup);
            }
            dmVar.i = true;
        }
    }

    public final void j(int i, int i2, nxo nxoVar) {
        List list = this.b;
        synchronized (list) {
            Object obj = nxoVar.d;
            obj.getClass();
            C0038do c0038doA = a((bv) obj);
            if (c0038doA == null) {
                if (((bv) obj).mTransitioning || ((bv) obj).mRemoving) {
                    obj.getClass();
                    c0038doA = b((bv) obj);
                } else {
                    c0038doA = null;
                }
            }
            if (c0038doA != null) {
                c0038doA.h(i, i2);
                return;
            }
            dn dnVar = new dn(i, i2, nxoVar);
            list.add(dnVar);
            dnVar.c(new be(this, dnVar, 5));
            dnVar.c(new be(this, dnVar, 6));
        }
    }
}
