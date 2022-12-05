import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule } from '@angular/router';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { AllNotaComponent } from './all-nota/all-nota.component';
import { RicercaComponent } from './ricerca/ricerca.component';
import { DeleteComponent } from './delete/delete.component';
import { ModificaComponent } from './modifica/modifica.component';
import { AppRoutes } from './app.routes';
import {HttpClientModule} from '@angular/common/http'
import { HttpClient } from '@angular/common/http';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AllNotaComponent,
    RicercaComponent,
    DeleteComponent,
    ModificaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule,
    RouterModule.forRoot(AppRoutes),
    HttpClientModule,
    
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
