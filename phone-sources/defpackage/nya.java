package defpackage;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nya implements nzm {
    final /* synthetic */ nyb a;
    private final /* synthetic */ int b;

    public nya(nyb nybVar, int i) {
        this.b = i;
        this.a = nybVar;
    }

    @Override // defpackage.nzm
    public final void c(int i) {
        nve nveVar;
        if (this.b == 0) {
            nyb nybVar = this.a;
            Lock lock = nybVar.g;
            lock.lock();
            try {
                if (nybVar.f) {
                    nybVar.f = false;
                    nybVar.k(i);
                } else {
                    nybVar.f = true;
                    nybVar.a.aE(i);
                }
                lock.unlock();
                return;
            } finally {
            }
        }
        nyb nybVar2 = this.a;
        Lock lock2 = nybVar2.g;
        lock2.lock();
        try {
            if (!nybVar2.f && (nveVar = nybVar2.e) != null && nveVar.c()) {
                nybVar2.f = true;
                nybVar2.b.aE(i);
                return;
            }
            nybVar2.f = false;
            nybVar2.k(i);
            lock2.unlock();
        } finally {
        }
    }

    @Override // defpackage.nzm
    public final void r(nve nveVar) {
        if (this.b != 0) {
            nyb nybVar = this.a;
            nybVar.g.lock();
            try {
                nybVar.d = nveVar;
                nybVar.f();
                return;
            } finally {
            }
        }
        nyb nybVar2 = this.a;
        nybVar2.g.lock();
        try {
            nybVar2.e = nveVar;
            nybVar2.f();
        } finally {
        }
    }

    @Override // defpackage.nzm
    public final void s(Bundle bundle) {
        if (this.b == 0) {
            nyb nybVar = this.a;
            nybVar.g.lock();
            try {
                nybVar.e = nve.a;
                nybVar.f();
                return;
            } finally {
            }
        }
        nyb nybVar2 = this.a;
        nybVar2.g.lock();
        try {
            Bundle bundle2 = nybVar2.c;
            if (bundle2 == null) {
                nybVar2.c = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            nybVar2.d = nve.a;
            nybVar2.f();
        } finally {
        }
    }
}
