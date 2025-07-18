package com.google.frameworks.client.data.android.debug;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import com.google.android.videos.R;
import defpackage.a;
import defpackage.at;
import defpackage.uqs;
import defpackage.uso;
import defpackage.usp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class HostnameOverrideActivity extends AppCompatActivity {
    public static Intent getIntent(Context context, Collection<uqs> collection) {
        a.H(!collection.isEmpty());
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(collection.size());
        Iterator<uqs> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new usp(it.next()));
        }
        Intent intent = new Intent(context, (Class<?>) HostnameOverrideActivity.class);
        intent.putParcelableArrayListExtra("to_display", arrayList);
        return intent;
    }

    @Override // defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.hostname_override_activity);
        if (bundle == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelableArrayList("configs_to_display", getIntent().getParcelableArrayListExtra("to_display"));
            uso usoVar = new uso();
            usoVar.setArguments(bundle2);
            at atVar = new at(getSupportFragmentManager());
            atVar.p(R.id.fragment_container, usoVar);
            atVar.e();
        }
    }

    public static Intent getIntent(Context context, uqs... uqsVarArr) {
        return getIntent(context, Arrays.asList(uqsVarArr));
    }
}
