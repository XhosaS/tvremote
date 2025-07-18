package j$.nio.file;

import java.nio.file.WatchEvent;

/* loaded from: classes3.dex */
public final /* synthetic */ class C implements E {
    public final /* synthetic */ WatchEvent.Kind a;

    public final /* synthetic */ boolean equals(Object obj) {
        WatchEvent.Kind kind = this.a;
        if (obj instanceof C) {
            obj = ((C) obj).a;
        }
        return kind.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.E
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // j$.nio.file.E
    public final /* synthetic */ Class type() {
        return this.a.type();
    }
}
