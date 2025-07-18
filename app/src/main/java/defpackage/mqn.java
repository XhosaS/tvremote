package defpackage;

import com.google.android.libraries.elements.interfaces.EnvironmentDataObserver;
import com.google.android.libraries.elements.interfaces.EnvironmentDataSource;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mqn extends EnvironmentDataSource {
    private final WeakReference a;

    public mqn(EnvironmentDataSource environmentDataSource) {
        this.a = new WeakReference(environmentDataSource);
    }

    @Override // com.google.android.libraries.elements.interfaces.EnvironmentDataSource
    public final byte[] getEnvironmentData() {
        EnvironmentDataSource environmentDataSource = (EnvironmentDataSource) this.a.get();
        return environmentDataSource != null ? environmentDataSource.getEnvironmentData() : new byte[0];
    }

    @Override // com.google.android.libraries.elements.interfaces.EnvironmentDataSource
    public final long subscribeToEnvironmentData(EnvironmentDataObserver environmentDataObserver) {
        EnvironmentDataSource environmentDataSource = (EnvironmentDataSource) this.a.get();
        if (environmentDataSource != null) {
            return environmentDataSource.subscribeToEnvironmentData(environmentDataObserver);
        }
        return 0L;
    }

    @Override // com.google.android.libraries.elements.interfaces.EnvironmentDataSource
    public final void unsubscribeFromEnvironmentData(long j) {
        EnvironmentDataSource environmentDataSource = (EnvironmentDataSource) this.a.get();
        if (environmentDataSource != null) {
            environmentDataSource.unsubscribeFromEnvironmentData(j);
        }
    }
}
