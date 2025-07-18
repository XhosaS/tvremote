package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class t {
    public int a;
    public int b;
    public int c;
    public int d;
    public ArrayList e = new ArrayList();

    public t(p pVar) {
        this.a = pVar.w;
        this.b = pVar.x;
        this.c = pVar.d();
        this.d = pVar.a();
        ArrayList arrayList = pVar.q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.e.add(new s((o) arrayList.get(i)));
        }
    }
}
