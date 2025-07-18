package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class laz {
    final /* synthetic */ lbb a;

    public laz(lbb lbbVar) {
        this.a = lbbVar;
    }

    public final void a(int i, String str, List list, boolean z, boolean z2) {
        kzz kzzVar;
        int i2 = i - 1;
        if (i2 == 0) {
            lbk lbkVar = this.a.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            kzzVar = labVar.j;
        } else if (i2 != 1) {
            if (i2 == 3) {
                lbk lbkVar2 = this.a.y;
                lab labVar2 = lbkVar2.f;
                lbkVar2.o(labVar2);
                kzzVar = labVar2.k;
            } else if (i2 != 4) {
                lbk lbkVar3 = this.a.y;
                lab labVar3 = lbkVar3.f;
                lbkVar3.o(labVar3);
                kzzVar = labVar3.i;
            } else if (z) {
                lbk lbkVar4 = this.a.y;
                lab labVar4 = lbkVar4.f;
                lbkVar4.o(labVar4);
                kzzVar = labVar4.g;
            } else if (z2) {
                lbk lbkVar5 = this.a.y;
                lab labVar5 = lbkVar5.f;
                lbkVar5.o(labVar5);
                kzzVar = labVar5.f;
            } else {
                lbk lbkVar6 = this.a.y;
                lab labVar6 = lbkVar6.f;
                lbkVar6.o(labVar6);
                kzzVar = labVar6.h;
            }
        } else if (z) {
            lbk lbkVar7 = this.a.y;
            lab labVar7 = lbkVar7.f;
            lbkVar7.o(labVar7);
            kzzVar = labVar7.d;
        } else if (z2) {
            lbk lbkVar8 = this.a.y;
            lab labVar8 = lbkVar8.f;
            lbkVar8.o(labVar8);
            kzzVar = labVar8.c;
        } else {
            lbk lbkVar9 = this.a.y;
            lab labVar9 = lbkVar9.f;
            lbkVar9.o(labVar9);
            kzzVar = labVar9.e;
        }
        int size = list.size();
        if (size == 1) {
            kzzVar.b(str, list.get(0));
            return;
        }
        if (size == 2) {
            kzzVar.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            kzzVar.a(str);
        } else {
            kzzVar.d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
