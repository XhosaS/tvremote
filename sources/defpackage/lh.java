package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import com.google.android.tv.remote.service.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lh extends ContextWrapper {
    private static Configuration b;
    public int a;
    private Resources.Theme c;
    private LayoutInflater d;
    private Configuration e;
    private Resources f;

    public lh() {
        super(null);
    }

    private final Resources b() {
        if (this.f == null) {
            if (this.e == null) {
                this.f = super.getResources();
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    Configuration configuration = this.e;
                    if (configuration != null) {
                        if (b == null) {
                            Configuration configuration2 = new Configuration();
                            configuration2.fontScale = 0.0f;
                            b = configuration2;
                        }
                        if (!configuration.equals(b)) {
                        }
                    }
                    this.f = super.getResources();
                }
                this.f = createConfigurationContext(this.e).getResources();
            }
        }
        return this.f;
    }

    private final void c() {
        if (this.c == null) {
            this.c = b().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.c.setTo(theme);
            }
        }
        this.c.applyStyle(this.a, true);
    }

    public final void a(Configuration configuration) {
        if (this.f != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.e != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.e = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return b().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.d == null) {
            this.d = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.d;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.c;
        if (theme != null) {
            return theme;
        }
        if (this.a == 0) {
            this.a = R.style.Theme_AppCompat_Light;
        }
        c();
        return this.c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.a != i) {
            this.a = i;
            c();
        }
    }

    public lh(Context context, int i) {
        super(context);
        this.a = i;
    }
}
