package defpackage;

import j$.util.Objects;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class yoz implements Serializable {
    private static final long serialVersionUID = -8514239465808977353L;
    public final String a;
    public final Long b;
    private final List c;

    public yoz(String str, Date date) {
        this.a = str;
        this.b = date == null ? null : Long.valueOf(date.getTime());
        this.c = new ArrayList();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yoz)) {
            return false;
        }
        yoz yozVar = (yoz) obj;
        return Objects.equals(this.a, yozVar.a) && Objects.equals(this.b, yozVar.b) && Objects.equals(this.c, yozVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }

    public final String toString() {
        yqq yqqVarB = yqr.b(this);
        yqqVarB.b("tokenValue", this.a);
        yqqVarB.b("expirationTimeMillis", this.b);
        yqqVarB.b("scopes", this.c);
        return yqqVarB.toString();
    }
}
