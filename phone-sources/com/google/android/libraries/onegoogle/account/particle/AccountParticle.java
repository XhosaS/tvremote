package com.google.android.libraries.onegoogle.account.particle;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.videos.R;
import defpackage.quw;
import defpackage.rjg;
import defpackage.rji;
import defpackage.unc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AccountParticle<AccountT> extends ConstraintLayout implements quw, rji {
    public final AccountParticleDisc j;
    public final TextView k;
    public final TextView l;
    public boolean m;
    public unc n;
    private final TextView o;

    public AccountParticle(Context context) {
        this(context, null);
    }

    @Override // defpackage.rji
    public final void b(rjg rjgVar) {
        if (this.m) {
            rjgVar.c(this, 90144);
            this.j.d(rjgVar);
        }
    }

    @Override // defpackage.rji
    public final void e(rjg rjgVar) {
        if (this.m) {
            AccountParticleDisc accountParticleDisc = this.j;
            if (accountParticleDisc.f) {
                accountParticleDisc.b.e(rjgVar);
            }
            if (accountParticleDisc.g) {
                accountParticleDisc.c.e(rjgVar);
            }
            rjgVar.e(this);
        }
    }

    @Override // defpackage.quw
    public final TextView f() {
        return this.o;
    }

    @Override // defpackage.quw
    public final TextView g() {
        return this.k;
    }

    @Override // defpackage.quw
    public final TextView h() {
        return this.l;
    }

    @Override // defpackage.quw
    public final AccountParticleDisc i() {
        return this.j;
    }

    public AccountParticle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ogAccountParticleStyle);
    }

    public AccountParticle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.account_particle, (ViewGroup) this, true);
        AccountParticleDisc accountParticleDisc = (AccountParticleDisc) findViewById(R.id.account_avatar);
        accountParticleDisc.getClass();
        this.j = accountParticleDisc;
        TextView textView = (TextView) findViewById(R.id.og_primary_account_information);
        textView.getClass();
        this.k = textView;
        TextView textView2 = (TextView) findViewById(R.id.og_secondary_account_information);
        textView2.getClass();
        this.l = textView2;
        this.o = (TextView) findViewById(R.id.counter);
    }
}
