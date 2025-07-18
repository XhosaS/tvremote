package defpackage;

import android.text.TextUtils;
import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class avq extends hz {
    final /* synthetic */ List a;
    final /* synthetic */ awp b;
    final /* synthetic */ avs c;

    public avq(avs avsVar, List list, awp awpVar) {
        this.c = avsVar;
        this.a = list;
        this.b = awpVar;
    }

    @Override // defpackage.hz
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.hz
    public final int b() {
        return this.c.c.size();
    }

    @Override // defpackage.hz
    public final boolean c(int i, int i2) {
        Object obj = this.c.c.get(i);
        Object obj2 = this.a.get(i2);
        xlm xlmVar = (xlm) obj;
        xlm xlmVar2 = (xlm) obj2;
        if (!TextUtils.equals(xlmVar.c, xlmVar2.c) || !TextUtils.equals(xlmVar.d, xlmVar2.d) || !TextUtils.equals(xlmVar.c, xlmVar2.c) || !Objects.equals(xlmVar.f, xlmVar2.f)) {
            return false;
        }
        hqi hqiVar = ((hqj) this.b).a;
        return hqiVar.a(obj) == hqiVar.a(obj2);
    }

    @Override // defpackage.hz
    public final boolean d(int i, int i2) {
        return TextUtils.equals(((xlm) this.c.c.get(i)).c, ((xlm) this.a.get(i2)).c);
    }

    @Override // defpackage.hz
    public final void e(int i, int i2) {
        this.c.c.get(i);
        this.a.get(i2);
    }
}
