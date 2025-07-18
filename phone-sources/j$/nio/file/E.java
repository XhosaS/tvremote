package j$.nio.file;

import java.nio.file.WatchEvent;

/* loaded from: classes4.dex */
public final /* synthetic */ class E implements G {
    public final /* synthetic */ WatchEvent.Modifier a;

    public final /* synthetic */ String a() {
        return this.a.name();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchEvent.Modifier modifier = this.a;
        if (obj instanceof E) {
            obj = ((E) obj).a;
        }
        return modifier.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
