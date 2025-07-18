package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dba implements czb, dbx {
    final int a;
    final int b;
    final bda c;

    public dba(int i, int i2, bda bdaVar) {
        this.a = i;
        this.b = i2;
        this.c = bdaVar;
    }

    @Override // defpackage.dbx
    public dab j() {
        return this.c.f(this.a, this.b);
    }

    @Override // defpackage.czb
    public final dab p() {
        try {
            return j();
        } catch (IOException e) {
            throw new daa(e.getMessage());
        }
    }
}
