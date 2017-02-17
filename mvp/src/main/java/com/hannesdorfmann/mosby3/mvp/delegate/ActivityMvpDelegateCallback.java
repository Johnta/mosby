/*
 *  Copyright 2015 Hannes Dorfmann.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.hannesdorfmann.mosby3.mvp.delegate;

import android.support.v4.app.FragmentActivity;
import com.hannesdorfmann.mosby3.mvp.MvpPresenter;
import com.hannesdorfmann.mosby3.mvp.MvpView;

/**
 * The MvpDelegate callback that will be called from  {@link
 * ActivityMvpDelegate}. This interface must be implemented by all
 * Activities that you want to support mosby's mvp.
 *
 * @author Hannes Dorfmann
 * @see MvpDelegateCallback
 * @since 2.0.0
 */
public interface ActivityMvpDelegateCallback<V extends MvpView, P extends MvpPresenter<V>>
    extends MvpDelegateCallback<V, P> {

}
