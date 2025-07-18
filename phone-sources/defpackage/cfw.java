package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfw implements Appendable {
    public final StringBuilder a;
    public final List b;
    public final List c;

    public cfw() {
        this((byte[]) null);
    }

    public final cfy a() {
        StringBuilder sb = this.a;
        String string = sb.toString();
        List list = this.c;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((cfv) list.get(i)).a(sb.length()));
        }
        return new cfy(string, arrayList);
    }

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(char c) {
        this.a.append(c);
        return this;
    }

    public final void b(cfy cfyVar) {
        StringBuilder sb = this.a;
        int length = sb.length();
        sb.append(cfyVar.b);
        List list = cfyVar.a;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                cfx cfxVar = (cfx) list.get(i);
                this.c.add(new cfv(cfxVar.a, cfxVar.b + length, cfxVar.c + length, cfxVar.d));
            }
        }
    }

    public final void c(String str) {
        this.a.append(str);
    }

    public final void d() {
        List list = this.b;
        if (list.isEmpty()) {
            cko.b("Nothing to pop.");
        }
        ((cfv) list.remove(list.size() - 1)).a = this.a.length();
    }

    public final void e(int i) {
        List list = this.b;
        if (i >= list.size()) {
            cko.b(i + " should be less than " + list.size());
        }
        while (list.size() - 1 >= i) {
            d();
        }
    }

    public /* synthetic */ cfw(byte[] bArr) {
        this.a = new StringBuilder(16);
        this.b = new ArrayList();
        this.c = new ArrayList();
        new ArrayList();
    }

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        if (charSequence instanceof cfy) {
            b((cfy) charSequence);
            return this;
        }
        this.a.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof cfy) {
            cfy cfyVar = (cfy) charSequence;
            StringBuilder sb = this.a;
            String str = cfyVar.b;
            int length = sb.length();
            sb.append((CharSequence) str, i, i2);
            List listA = cfz.a(cfyVar, i, i2, null);
            if (listA != null) {
                int size = listA.size();
                for (int i3 = 0; i3 < size; i3++) {
                    cfx cfxVar = (cfx) listA.get(i3);
                    this.c.add(new cfv(cfxVar.a, cfxVar.b + length, cfxVar.c + length, cfxVar.d));
                }
            }
            return this;
        }
        this.a.append(charSequence, i, i2);
        return this;
    }

    public cfw(cfy cfyVar) {
        this((byte[]) null);
        b(cfyVar);
    }
}
