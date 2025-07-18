package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
class agyw {
    public static final void a(Appendable appendable, Object obj, agux aguxVar) throws IOException {
        if (aguxVar != null) {
            appendable.append((CharSequence) aguxVar.a(obj));
            return;
        }
        if (obj == null || (obj instanceof CharSequence)) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }
}
