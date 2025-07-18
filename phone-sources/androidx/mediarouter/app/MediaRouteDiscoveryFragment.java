package androidx.mediarouter.app;

import android.os.Bundle;
import defpackage.bv;
import defpackage.fur;
import defpackage.fus;
import defpackage.fuy;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MediaRouteDiscoveryFragment extends bv {
    private fuy a;
    private fur b;
    private fus c;

    private final void a() {
        if (this.b == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.b = fur.a(arguments.getBundle("selector"));
            }
            if (this.b == null) {
                this.b = fur.a;
            }
        }
    }

    private final void b() {
        if (this.a == null) {
            this.a = fuy.b(getContext());
        }
    }

    public fuy getMediaRouter() {
        b();
        return this.a;
    }

    public fur getRouteSelector() {
        a();
        return this.b;
    }

    @Override // defpackage.bv
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a();
        b();
        fus fusVarOnCreateCallback = onCreateCallback();
        this.c = fusVarOnCreateCallback;
        if (fusVarOnCreateCallback != null) {
            this.a.d(this.b, fusVarOnCreateCallback, 0);
        }
    }

    public fus onCreateCallback() {
        return new fus() { // from class: androidx.mediarouter.app.MediaRouteDiscoveryFragment.1
        };
    }

    @Override // defpackage.bv
    public void onDestroy() {
        fus fusVar = this.c;
        if (fusVar != null) {
            this.a.f(fusVar);
        }
        super.onDestroy();
    }

    public int onPrepareCallbackFlags() {
        return 4;
    }

    @Override // defpackage.bv
    public void onStart() {
        super.onStart();
        fus fusVar = this.c;
        if (fusVar != null) {
            this.a.d(this.b, fusVar, onPrepareCallbackFlags());
        }
    }

    @Override // defpackage.bv
    public void onStop() {
        fus fusVar = this.c;
        if (fusVar != null) {
            this.a.d(this.b, fusVar, 0);
        }
        super.onStop();
    }

    public void setRouteSelector(fur furVar) {
        if (furVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        a();
        if (this.b.equals(furVar)) {
            return;
        }
        this.b = furVar;
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putBundle("selector", furVar.b);
        setArguments(arguments);
        fus fusVar = this.c;
        if (fusVar != null) {
            this.a.f(fusVar);
            this.a.d(this.b, this.c, onPrepareCallbackFlags());
        }
    }
}
