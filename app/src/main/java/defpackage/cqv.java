package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cqv {
    private final List a = new ArrayList();

    final void a(crn crnVar) {
        this.a.add(crnVar);
    }

    public final void b(Path path) {
        List list = this.a;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            crn crnVar = (crn) list.get(size);
            ThreadLocal threadLocal = cwy.a;
            if (crnVar != null && !crnVar.a) {
                cwy.d(path, ((crx) crnVar.b).k() / 100.0f, ((crx) crnVar.c).k() / 100.0f, ((crx) crnVar.d).k() / 360.0f);
            }
        }
    }
}
