package defpackage;

import android.text.TextUtils;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
public class gnh implements Comparable {
    public final String a;
    public final Instant b;

    public gnh(String str, Instant instant) {
        this.a = str;
        this.b = instant;
    }

    final boolean a() {
        return !TextUtils.isEmpty(this.a);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        gnh gnhVar = (gnh) obj;
        return a() == gnhVar.a() ? this.b.compareTo(gnhVar.b) : !a() ? -1 : 1;
    }
}
