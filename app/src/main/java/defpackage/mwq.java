package defpackage;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.ByteStoreConfig;
import com.google.android.libraries.elements.interfaces.NamespacedStoreConfig;
import com.google.android.libraries.elements.interfaces.Snapshot;
import com.google.android.libraries.elements.interfaces.Subscription;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mwq implements oat {
    public final yrp a = yru.a(new yrp() { // from class: mwo
        @Override // defpackage.yrp
        public final Object eV() {
            mhw.a();
            ByteStore byteStoreCreate = ByteStore.create(new ByteStoreConfig(false, NamespacedStoreConfig.EMPTY_CONFIG, false, true), null);
            if (byteStoreCreate != null) {
                return byteStoreCreate;
            }
            throw new ocp("Error creating Elements ByteStore.");
        }
    });

    @Override // defpackage.oat
    public final agfo a(final String str) {
        final ByteStore byteStore = (ByteStore) this.a.eV();
        return agfo.e(new agfq() { // from class: mwn
            @Override // defpackage.agfq
            public final void a(agfp agfpVar) {
                String str2 = str;
                mwp mwpVar = new mwp(agfpVar, str2);
                ByteStore byteStore2 = byteStore;
                final Subscription subscriptionSubscribe = byteStore2.subscribe(str2, mwpVar);
                if (subscriptionSubscribe != null) {
                    agfpVar.c(new aggx() { // from class: mwm
                        @Override // defpackage.aggx
                        public final void a() {
                            subscriptionSubscribe.cancel();
                        }
                    });
                }
                Snapshot snapshot = byteStore2.snapshot();
                if (snapshot != null) {
                    agfpVar.b(yqt.h(snapshot.find(str2)));
                }
            }
        });
    }

    @Override // defpackage.oat
    public final /* synthetic */ void b(String str, byte[] bArr) {
        d(str, bArr);
    }

    @Override // defpackage.oat
    public final void c(String str) {
        ((ByteStore) this.a.eV()).set(str, null);
    }

    @Override // defpackage.oat
    public final void d(String str, byte[] bArr) {
        ((ByteStore) this.a.eV()).set(str, bArr);
    }
}
