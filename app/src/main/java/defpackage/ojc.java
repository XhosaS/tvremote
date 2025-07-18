package defpackage;

import com.google.common.collect.Lists;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ojc extends oji {
    private final acgd a;
    private final yyk b;
    private final yyk c;

    public ojc(acgd acgdVar, yyk yykVar, yyk yykVar2) {
        if (acgdVar == null) {
            throw new NullPointerException("Null corpus");
        }
        this.a = acgdVar;
        if (yykVar == null) {
            throw new NullPointerException("Null elementsToUpdate");
        }
        this.b = yykVar;
        if (yykVar2 == null) {
            throw new NullPointerException("Null elementsToDelete");
        }
        this.c = yykVar2;
    }

    @Override // defpackage.oji
    public final yyk a() {
        return this.c;
    }

    @Override // defpackage.oji
    public final yyk b() {
        return this.b;
    }

    @Override // defpackage.oji
    public final acgd c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oji) {
            oji ojiVar = (oji) obj;
            if (this.a.equals(ojiVar.c()) && Lists.d(this.b, ojiVar.b()) && Lists.d(this.c, ojiVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        yyk yykVar = this.b;
        return "CorpusUploadMutation{corpus=" + Integer.toString(this.a.dE) + ", elementsToUpdate=" + yykVar.toString() + ", elementsToDelete=" + this.c.toString() + "}";
    }
}
