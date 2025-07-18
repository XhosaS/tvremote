package defpackage;

import android.os.FileObserver;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoy extends FileObserver {
    public static final Object a = new Object();
    public static final Map b = new LinkedHashMap();
    public final CopyOnWriteArrayList c;

    public aoy(String str) {
        super(str, 128);
        this.c = new CopyOnWriteArrayList();
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((agux) it.next()).a(str);
        }
    }
}
