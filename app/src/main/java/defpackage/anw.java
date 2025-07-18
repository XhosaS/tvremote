package defpackage;

import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anw implements apl {
    public static final Set a = new LinkedHashSet();
    public static final Object b = new Object();
    public final agux c;
    public final agum d;
    public final aoz e;

    public anw(aoz aozVar, agux aguxVar, agum agumVar) {
        this.e = aozVar;
        this.c = aguxVar;
        this.d = agumVar;
    }

    public static final agpu a(File file) {
        synchronized (b) {
            a.remove(file.getAbsolutePath());
        }
        return agpu.a;
    }
}
