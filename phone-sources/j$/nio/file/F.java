package j$.nio.file;

import java.nio.file.WatchEvent;

/* loaded from: classes4.dex */
public final /* synthetic */ class F implements WatchEvent.Modifier {
    public final /* synthetic */ G a;

    public /* synthetic */ F(G g) {
        this.a = g;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        G g = this.a;
        if (obj instanceof F) {
            obj = ((F) obj).a;
        }
        return g.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.WatchEvent.Modifier
    public final /* synthetic */ String name() {
        return ((E) this.a).a();
    }
}
