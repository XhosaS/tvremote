package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class neq implements Runnable {
    final /* synthetic */ ner a;
    private final Uri b;
    private final String c;
    private final boolean d;
    private final Map e;
    private int f = 3;

    public neq(ner nerVar, Uri uri, String str, boolean z) {
        this.a = nerVar;
        this.b = uri;
        this.c = str;
        this.d = z;
        HashMap map = new HashMap(nerVar.c);
        this.e = map;
        map.put("X-Goog-Event-Time", Long.toString(System.currentTimeMillis()));
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            ArrayList arrayList = this.a.d;
            synchronized (arrayList) {
                String str = this.c;
                if (arrayList.contains(str)) {
                    if (this.d) {
                        arrayList.remove(str);
                    }
                    return;
                }
                Map map = this.e;
                map.put("X-Goog-Request-Time", Long.toString(System.currentTimeMillis()));
                ner nerVar = this.a;
                if (nerVar.a.a(this.b, map) == 204 || this.d) {
                    return;
                }
                ArrayList arrayList2 = nerVar.d;
                synchronized (arrayList2) {
                    arrayList2.add(this.c);
                }
            }
        } catch (IOException unused) {
            int i = this.f;
            this.f = i - 1;
            if (i > 0) {
                this.a.b.a(300000L, this);
            }
        }
    }
}
